package com.third;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;

import org.junit.Test;

public class EmployeeWithEquals {
	private long id;
	private String firstName;
	private String lastName;
	
	public EmployeeWithEquals(long id, String firstName, String lastName) {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeWithEquals other = (EmployeeWithEquals) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName);
	}
	
	public static int getSize(HashSet<EmployeeWithEquals> empSet) {
		return empSet
                .stream().map(employee -> employee.getId() + employee.getFirstName() + employee.getLastName())
                .collect(Collectors.toSet())
                .size();
	}
	
	public static int sameDetailsSameObjects() {
		HashSet<EmployeeWithEquals> empSet = new HashSet<>();
		EmployeeWithEquals emp1 = new EmployeeWithEquals(1, "John", "Doe");
		EmployeeWithEquals emp2 = new EmployeeWithEquals(2, "Mark", "Agnel");
		EmployeeWithEquals emp3 = emp1;
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		return empSet.size();
	}
	
	public static void main(String[] args) {
		System.out.println("Same Details Same Objects : "+sameDetailsSameObjects());
	}
	
}
