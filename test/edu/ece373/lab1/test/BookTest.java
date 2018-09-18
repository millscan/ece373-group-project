package edu.ece373.lab1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.ece373.lab1.*;

class BookTest {

	@Test
	void testBook() {
		Book b = new Book();
		assertEquals("unknown", b.getTitle());
		assertEquals("unknown", b.getAuthor());
		assertEquals(null, b.getPerson());
	}
	
	@Test
	void testSetTitle() {
		Book b = new Book();
		b.setTitle("1984");
		assertEquals(b.getTitle(), "1984");
	}
	
	@Test
	void testSetAuthor() {
		Book b = new Book();
		b.setAuthor("George Orwell");
		assertEquals(b.getAuthor(), "George Orwell");
	}
	
	@Test
	void testSetPerson() {
		Book b = new Book();
		Person p = new Person();
		p.setName("Elan");
		b.setPerson(p);
		assertEquals(b.getPerson(), p);
		assertEquals(b.getPerson().getName(), "Elan");
	}

}
