package com.enigma.arinda.model.transaction;

import com.enigma.arinda.model.transactions.TransactionElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class TransactionElementTest {

    @Test
    void setModelReturnSuccess() {
        TransactionElement expected = new TransactionElement();
        expected.setId(1);
        expected.setQuantity(1);
        expected.setTotalPrice(1);
        expected.setItem(null);

        TransactionElement actual = expected;

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getQuantity(), actual.getQuantity());
        assertEquals(expected.getTotalPrice(), actual.getTotalPrice());
        assertEquals(expected.getItem(), actual.getItem());

    }


}

