package com.enigma.arinda.model.transaction;

import com.enigma.arinda.model.transactions.TransactionResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TransactionResponseTest {

    @Test
    void setModelReturnSuccess() {
        TransactionResponse expected = new TransactionResponse();
        expected.setId(1);
        expected.setQuantity(1);
        expected.setTotalPrice(1);
        expected.setUserModel(null);
        expected.setItemResponse(null);

        TransactionResponse actual = expected;

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getTotalPrice(), actual.getTotalPrice());
        assertEquals(expected.getUserModel(), actual.getUserModel());
        assertEquals(expected.getItemResponse(), actual.getItemResponse());

    }


}

