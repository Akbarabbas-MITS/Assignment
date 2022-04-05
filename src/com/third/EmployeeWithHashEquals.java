package com.third;

import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeWithHashEquals {
	private long id;
	private String firstName;
	private String lastName;
	
	public EmployeeWithHashEquals(long id, String firstName, String lastName) {
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeWithHashEquals other = (EmployeeWithHashEquals) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName);
	}
	
	public static int getSize(HashSet<EmployeeWithHashEquals> empSet) {
		return empSet
                .stream().map(employee -> employee.getId() + employee.getFirstName() + employee.getLastName())
                .collect(Collectors.toSet())
                .size();
	}

	public static int sameDetailsSameObjects() {
		HashSet<EmployeeWithHashEquals> empSet = new HashSet<>();
		EmployeeWithHashEquals emp1 = new EmployeeWithHashEquals(1, "John", "Doe");
		EmployeeWithHashEquals emp2 = new EmployeeWithHashEquals(2, "Mark", "Agnel");
		EmployeeWithHashEquals emp3 = new EmployeeWithHashEquals(1, "John", "Doe");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		return empSet.size();
	}
	
	public static void main(String[] args) {
		System.out.println("Same Details Same Objects : "+sameDetailsSameObjects());
	}
	
}
