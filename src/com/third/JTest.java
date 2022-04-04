package com.third;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JTest {
	@Test
	public void testEmployeeWithEquals() {
//		assertEquals(3, EmployeeWithEquals.sameDetailsDifferentObjects());
		assertEquals(2, EmployeeWithEquals.sameDetailsSameObjects());
	}
	
	@Test
	public void testEmployeeWithHash() {
//		assertEquals(3, EmployeeWithHash.sameDetailsDifferentObjects());
		assertEquals(2, EmployeeWithHash.sameDetailsSameObjects());
	}
	
	@Test
	public void testEmployeeWithHashEquals() {
//		assertEquals(2, EmployeeWithHashEquals.sameDetailsDifferentObjects());
		assertEquals(2, EmployeeWithHashEquals.sameDetailsSameObjects());
	}
	
	@Test
	public void testEmployeeWithoutHashEquals() {
//		assertEquals(3, EmployeeWithoutHashEquals.sameDetailsDifferentObjects());
		assertEquals(2, EmployeeWithoutHashEquals.sameDetailsSameObjects());
	}
}
