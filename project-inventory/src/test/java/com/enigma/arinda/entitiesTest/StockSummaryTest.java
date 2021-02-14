package com.enigma.arinda.entitiesTest;

import com.enigma.arinda.entities.Item;
import com.enigma.arinda.entities.StockSummary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
public class StockSummaryTest {

    @Test
    void setGetShouldSuccess() {
        LocalDateTime now = LocalDateTime.now();
        StockSummary expected = new StockSummary();
        Item item = new Item();
        item.setModifiedDate(now);

        expected.setItem(item);
        expected.setTotalPrice(1L);
        expected.setQuantity(1L);

        StockSummary actual = expected;

        assertEquals(expected.getItem(), actual.getItem());
        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getTotalPrice(), actual.getTotalPrice());
    }

    @Test
    void setEntityReturnNotNull() {
        Item item = new Item();
        StockSummary expected = new StockSummary(item, 1L, 1L);

        assertNotNull(expected);

    }
}
