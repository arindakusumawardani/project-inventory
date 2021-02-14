package com.enigma.arinda.model.items;

import com.enigma.arinda.model.UnitModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ItemResponseTest {
    @Mock
    UnitModel unitModel;

    @Test
    void setItemModelReturnSuccess() {
        ItemResponse expected = new ItemResponse();
        expected.setId(1);
        expected.setName("name");
        expected.setPrice(1);
        expected.setUnit(unitModel);

        ItemResponse actual = expected;

        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getPrice(), actual.getPrice());
        assertEquals(expected.getPrice(), actual.getPrice());
        assertEquals(expected.getPrice(), actual.getPrice());

    }


}
