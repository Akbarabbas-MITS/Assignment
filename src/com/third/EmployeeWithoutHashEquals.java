package com.third;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class EmployeeWithoutHashEquals {
	private long id;
	private String firstName;
	private String lastName;
	
	public EmployeeWithoutHashEquals(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public static int sameDetailsDifferentObjects() {
		HashSet<EmployeeWithoutHashEquals> empSet = new HashSet<>();
		EmployeeWithoutHashEquals emp1 = new EmployeeWithoutHashEquals(1, "John", "Doe");
		EmployeeWithoutHashEquals emp2 = new EmployeeWithoutHashEquals(2, "Mark", "Agnel");
		EmployeeWithoutHashEquals emp3 = new EmployeeWithoutHashEquals(1, "John", "Doe");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		return empSet.size();
	}
	
	
	public static int sameDetailsSameObjects() {
		HashSet<EmployeeWithoutHashEquals> empSet = new HashSet<>();
		EmployeeWithoutHashEquals emp1 = new EmployeeWithoutHashEquals(1, "John", "Doe");
		EmployeeWithoutHashEquals emp2 = new EmployeeWithoutHashEquals(2, "Mark", "Agnel");
		EmployeeWithoutHashEquals emp3 = emp1;
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		return empSet.size();
	}
	
	public static void main(String[] args) {
		System.out.println("Same Details Different Objects : "+sameDetailsDifferentObjects());
		System.out.println("Same Details Same Objects : "+sameDetailsSameObjects());
	}
	
}

class TestClass {
	@Test
	public void testWithoutHashEquals() {
		assertEquals(3, EmployeeWithoutHashEquals.sameDetailsDifferentObjects());
		assertEquals(2, EmployeeWithoutHashEquals.sameDetailsSameObjects());
	}
}