package com.enigma.arinda.model.items;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class itemElementTest {

    @Test
    void setItemElementReturnSuccess() {
        ItemElement expected = new ItemElement();
        expected.setId(1);
        expected.setName("name");
        expected.setPrice(1);

        ItemElement actual = expected;

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getPrice(), actual.getPrice());

    }


}
