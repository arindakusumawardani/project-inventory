package com.enigma.arinda;

import com.enigma.arinda.entities.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProjectApplicationTests {

	@Test
	void contextLoads() {
        Transaction transaction = new Transaction();

        assertNotNull(transaction);
	}

}
