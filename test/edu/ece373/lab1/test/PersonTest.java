package edu.ece373.lab1.test;

import edu.ece373.lab1.Person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person p = new Person();
		
		assertEquals("unknown", p.getName());
		assertEquals(2, p.getMaxBooks());
	}

	@Test
	void testSetName() {
		Person p = new Person();
		p.setName("Jack");
		assertEquals("Jack", p.getName());
	}

	@Test
	void testSetMaxBooks() {
		Person p = new Person();
		p.setMaxBooks(23);
		assertEquals(23, p.getMaxBooks());
	}

}
