package com.enigma.arinda.model.stokcs;

import com.enigma.arinda.model.stocks.StockSearch;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StockSearchTest {

    @Test
    void setStockElementReturnSuccess() {
        StockSearch expected = new StockSearch();
        expected.setId(1);
        expected.setQuantity(1);
        expected.setPage(1);
        expected.setSize(1);
        expected.setSort(Sort.Direction.ASC);

        StockSearch actual = expected;

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getPage(), actual.getPage());
        assertEquals(expected.getSize(), actual.getSize());
        assertEquals(expected.getSort(), actual.getSort());


    }


}
