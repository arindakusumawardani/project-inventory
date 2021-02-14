package com.enigma.arinda.model.transactions;


import com.enigma.arinda.model.PageSearch;
import com.enigma.arinda.model.items.ItemSearch;
import com.enigma.arinda.model.UnitSearch;

public class TransactionSearch extends PageSearch {
    private Integer totalPrice;
    private UnitSearch unitSearch;
    private ItemSearch itemSearch;
    private Integer quantity;

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public UnitSearch getUnitSearch() {
        return unitSearch;
    }

    public void setUnitSearch(UnitSearch unitSearch) {
        this.unitSearch = unitSearch;
    }

    public ItemSearch getItemSearch() {
        return itemSearch;
    }

    public void setItemSearch(ItemSearch itemSearch) {
        this.itemSearch = itemSearch;
    }
}
