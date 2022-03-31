package com.third;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Objects;

import org.junit.Test;

public class EmployeeWithHash {
	private long id;
	private String firstName;
	private String lastName;
	
	public EmployeeWithHash(long id, String firstName, String lastName) {
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
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName);
	}

	public static int sameDetailsDifferentObjects() {
		HashSet<EmployeeWithHash> empSet = new HashSet<>();
		EmployeeWithHash emp1 = new EmployeeWithHash(1, "John", "Doe");
		EmployeeWithHash emp2 = new EmployeeWithHash(2, "Mark", "Agnel");
		EmployeeWithHash emp3 = new EmployeeWithHash(1, "John", "Doe");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		return empSet.size();
	}
	
	
	public static int sameDetailsSameObjects() {
		HashSet<EmployeeWithHash> empSet = new HashSet<>();
		EmployeeWithHash emp1 = new EmployeeWithHash(1, "John", "Doe");
		EmployeeWithHash emp2 = new EmployeeWithHash(2, "Mark", "Agnel");
		EmployeeWithHash emp3 = emp1;
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		return empSet.size();
	}
	
	public static void main(String[] args) {
		System.out.println("Same Details Different Objects : "+sameDetailsDifferentObjects());
		System.out.println("Same Details Same Objects : "+sameDetailsSameObjects());
	}
	
	@Test
	public void test() {
		assertEquals(3, sameDetailsDifferentObjects());
		assertEquals(2, sameDetailsSameObjects());
	}
	
}
