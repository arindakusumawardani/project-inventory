package com.enigma.arinda.model.transaction;


import com.enigma.arinda.model.transactions.TransactionRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TransactionRequestTest {

    @Test
    void setModelReturnSuccess() {
        TransactionRequest expected = new TransactionRequest();
        expected.setQuantity(1);
        expected.setStockId(1);
        expected.setUserId(1);
        expected.setItemId(1);

        TransactionRequest actual = expected;

        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getStockId(), actual.getStockId());
        assertEquals(expected.getUserId(), actual.getUserId());
        assertEquals(expected.getItemId(), actual.getItemId());

    }


}

