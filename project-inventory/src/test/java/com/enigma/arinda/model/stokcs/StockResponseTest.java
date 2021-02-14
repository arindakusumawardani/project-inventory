package com.enigma.arinda.model.stokcs;

import com.enigma.arinda.model.items.ItemResponse;
import com.enigma.arinda.model.stocks.StockResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StockResponseTest {

    @Mock
    ItemResponse itemResponse;
    @Test
    void setStockResponseReturnSuccess() {
        StockResponse expected = new StockResponse();
        expected.setQuantity(1);
        expected.setItem(itemResponse);
        expected.setTotalPrice(1);

        StockResponse actual = expected;

        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getTotalPrice(), actual.getTotalPrice());
        assertEquals(expected.getItem(), actual.getItem());

    }
}
