package com.third;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class JTest {
	@Test
	public void testEmployeeWithEquals() {
		HashSet<EmployeeWithEquals> empSet = new HashSet<>();
		EmployeeWithEquals emp1 = new EmployeeWithEquals(1, "John", "Doe");
		EmployeeWithEquals emp2 = new EmployeeWithEquals(2, "Mark", "Agnel");
		EmployeeWithEquals emp3 = new EmployeeWithEquals(1, "John", "Doe");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		int expectedSize = EmployeeWithEquals.getSize(empSet);
		assertEquals(expectedSize, empSet.size());
	}
	
	@Test
	public void testEmployeeWithHash() {
		HashSet<EmployeeWithHash> empSet = new HashSet<>();
		EmployeeWithHash emp1 = new EmployeeWithHash(1, "John", "Doe");
		EmployeeWithHash emp2 = new EmployeeWithHash(2, "Mark", "Agnel");
		EmployeeWithHash emp3 = new EmployeeWithHash(1, "John", "Doe");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		int expectedSize = EmployeeWithHash.getSize(empSet);
		assertEquals(expectedSize, empSet.size());
	}
	
	@Test
	public void testEmployeeWithHashEquals() {
		HashSet<EmployeeWithHashEquals> empSet = new HashSet<>();
		EmployeeWithHashEquals emp1 = new EmployeeWithHashEquals(1, "John", "Doe");
		EmployeeWithHashEquals emp2 = new EmployeeWithHashEquals(2, "Mark", "Agnel");
		EmployeeWithHashEquals emp3 = new EmployeeWithHashEquals(1, "John", "Doe");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		int expectedSize = EmployeeWithHashEquals.getSize(empSet);
		assertEquals(expectedSize, empSet.size());
	}
	
	@Test
	public void testEmployeeWithoutHashEquals() {
		HashSet<EmployeeWithoutHashEquals> empSet = new HashSet<>();
		EmployeeWithoutHashEquals emp1 = new EmployeeWithoutHashEquals(1, "John", "Doe");
		EmployeeWithoutHashEquals emp2 = new EmployeeWithoutHashEquals(2, "Mark", "Agnel");
		EmployeeWithoutHashEquals emp3 = new EmployeeWithoutHashEquals(1, "John", "Doe");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		int expectedSize = EmployeeWithoutHashEquals.getSize(empSet);
		assertEquals(expectedSize, empSet.size());
	}
}
