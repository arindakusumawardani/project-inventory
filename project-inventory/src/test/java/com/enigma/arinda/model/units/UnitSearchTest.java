package com.enigma.arinda.model.units;

import com.enigma.arinda.model.UnitSearch;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UnitSearchTest {

    @Test
    void setUnitResponseReturnSuccess() {
        UnitSearch expected = new UnitSearch();
        expected.setCode("a");
        expected.setDescription("a");


        UnitSearch actual = expected;

        assertEquals(expected.getCode(), actual.getCode());
        assertEquals(expected.getDescription(), actual.getDescription());

    }
}
