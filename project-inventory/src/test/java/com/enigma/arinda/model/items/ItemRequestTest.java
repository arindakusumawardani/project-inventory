package com.enigma.arinda.model.items;

import com.enigma.arinda.entities.Unit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ItemRequestTest {

    @Autowired
    private Unit unit;

    @Test
    void setItemModelReturnSuccess() {
        ItemRequest expected = new ItemRequest();
        expected.setName("name");
        expected.setPrice(1);
        expected.setUnitId(1);

        ItemRequest actual = expected;

        assertEquals(expected.getUnitId(), actual.getUnitId());
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getPrice(), actual.getPrice());

    }


}
