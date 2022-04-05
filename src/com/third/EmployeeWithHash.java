package com.third;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;

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
		return Objects.hash(id, firstName, lastName);
	}
	
	public static int getSize(HashSet<EmployeeWithHash> empSet) {
		return empSet
                .stream().map(employee -> employee.getId() + employee.getFirstName() + employee.getLastName())
                .collect(Collectors.toSet())
                .size();
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
		System.out.println("Same Details Same Objects : "+sameDetailsSameObjects());
	}
	
}
