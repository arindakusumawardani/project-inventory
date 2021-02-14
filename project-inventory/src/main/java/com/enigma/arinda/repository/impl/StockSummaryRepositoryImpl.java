package com.enigma.arinda.repository.impl;

import com.enigma.arinda.entities.Item;
import com.enigma.arinda.entities.Stock;
import com.enigma.arinda.entities.StockSummary;
import com.enigma.arinda.repository.StockSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class StockSummaryRepositoryImpl implements StockSummaryRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<StockSummary> findAllSummaries() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<StockSummary> criteriaQuery = builder.createQuery(StockSummary.class);
        Root<Stock> root = criteriaQuery.from(Stock.class);

        criteriaQuery.multiselect(root.get("item"), builder.sum(root.get("quantity")), builder.sum(root.get("totalPrice")))
                .groupBy(root.get("item"));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public StockSummary findSummaryByItem(Item item) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<StockSummary> criteriaQuery = builder.createQuery(StockSummary.class);
        Root<Stock> root = criteriaQuery.from(Stock.class);

        criteriaQuery.multiselect(
                root.get("item"), builder.sum(root.get("quantity")), builder.sum(root.get("totalPrice"))
        )
                .where(builder.equal(root.get("item"), builder.parameter(Item.class, "item")))
                .groupBy(root.get("item"));

        Query query = entityManager.createQuery(criteriaQuery);
        query.setParameter("item", item);

        return (StockSummary) query.getSingleResult();
    }
}
