package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class arrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a', 'a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}
	
	@Test
	void indexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1, arrayChar1.indexOf('4'));
	
	}
	
	@Test
	void lastIndexOfTest() {
		char[] ar1 = {'1', '2', '3', '2', 'a'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1, arrayChar1.lastIndexOf('4'));
		assertEquals(4, arrayChar1.lastIndexOf('a'));
		
	}
	@Test
	void countTest() {
		char[] ar1 = {'1', '2', '3', '2', '2', '0', 'a'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(3, arrayChar1.count('2'));
		assertEquals(0, arrayChar1.count('4'));
		
	}
	
	@Test 
	void compareToIgnoreCaseTest() {
		char[] ar1 = {'a', 'b', 'c', 'd'};
		char[] ar2 = {'A'};
		char[] ar3 = {'a', 'B', 'c', 'D'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar3));
		assertEquals(3, arrayChar1.compareToIgnoreCase(arrayChar2));
			
	}
	
	@Test
	void containsTest() {
		char[] ar1 = {'1', '2', '3', '2', '2', '0', 'a'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertTrue(arrayChar1.contains('2'));
		assertFalse(arrayChar1.contains('5'));
	}
	
	@Test
	void equalsTest() {
		char[] ar1 = {'a', 'b', 'c', 'd'};
		char[] ar2 = {'A'};
		char[] ar3 = {'a', 'b', 'c', 'd'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertTrue(arrayChar1.equals(arrayChar3));
		assertFalse(arrayChar1.equals(arrayChar2));
		assertFalse(arrayChar1.equals(new ArrayChar(new char[] {'a', 'B', 'c', 'D'})));
		
	}
	@Test
	void equalsIgnoreCaseTest() {
		char[] ar1 = {'a', 'b', 'c', 'd'};
		char[] ar2 = {'A'};
		char[] ar3 = {'a', 'B', 'c', 'D'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertTrue(arrayChar1.equalsIgnoreCase(arrayChar3));
		assertFalse(arrayChar1.equalsIgnoreCase(arrayChar2));
	}
	

}
