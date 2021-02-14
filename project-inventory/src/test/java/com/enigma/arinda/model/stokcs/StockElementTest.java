package com.enigma.arinda.model.stokcs;

import com.enigma.arinda.model.stocks.StockElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StockElementTest {

    @Test
    void setStockElementReturnSuccess() {
        StockElement expected = new StockElement();
        expected.setId(1);
        expected.setQuantity(1);
        expected.setTotalPrice(1);

        StockElement actual = expected;

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getTotalPrice(), actual.getTotalPrice());

    }


}
