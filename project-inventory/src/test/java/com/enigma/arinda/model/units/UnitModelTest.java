package com.enigma.arinda.model.units;

import com.enigma.arinda.model.UnitModel;
import com.enigma.arinda.model.items.ItemResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UnitModelTest {

    @Mock
    ItemResponse itemResponse;

    @Test
    void setUnitResponseReturnSuccess() {
        UnitModel expected = new UnitModel();
        expected.setId(1);
        expected.setCode("a");
        expected.setDescription("a");

        UnitModel actual = expected;

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getCode(), actual.getCode());
        assertEquals(expected.getDescription(), actual.getDescription());

    }
}
