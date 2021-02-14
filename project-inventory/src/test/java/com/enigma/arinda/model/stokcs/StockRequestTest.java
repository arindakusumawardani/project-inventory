package com.enigma.arinda.model.stokcs;

import com.enigma.arinda.model.stocks.StockRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StockRequestTest {

    @Test
    void setStockRequestReturnSuccess() {
        StockRequest expected = new StockRequest();
        expected.setQuantity(1);
        expected.setItemId(1);

        StockRequest actual = expected;

        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getItemId(), actual.getItemId());

    }
}
