package com.fourth;

import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SortJTest {
	@Test
	public void employeeTreeSetDefaultSortingTest() {
		String expectedStringEmpList = "[Employee{id=1, firstName='Michael', lastName='Dew'}, "
				+ "Employee{id=2, firstName='Ally', lastName='Dactyl'}, "
				+ "Employee{id=3, firstName='John', lastName='Doe'}]";

		Set<Employee> empTSet = new TreeSet<>();

		empTSet.add(new Employee(3, "John", "Doe"));
		empTSet.add(new Employee(1, "Michael", "Dew"));
		empTSet.add(new Employee(2, "Ally", "Dactyl"));
		System.out.println(empTSet);
		assertEquals(expectedStringEmpList, empTSet.toString());
	}

	@Test
	public void employeeTreeSetCustomSortingWithFirstNameTest() {
		String expectedStringEmpList = "[Employee{id=2, firstName='Ally', lastName='Dactyl'}, "
				+ "Employee{id=3, firstName='John', lastName='Doe'}, "
				+ "Employee{id=1, firstName='Michael', lastName='Dew'}]";

//adding comparator for sorting on the basis of first name
		Set<Employee> empSet = new TreeSet(new EmployeeSortByFirstName());
		empSet.add(new Employee(1, "Michael", "Dew"));
		empSet.add(new Employee(2, "Ally", "Dactyl"));
		empSet.add(new Employee(3, "John", "Doe"));

		System.out.println(empSet);
		assertEquals(expectedStringEmpList, empSet.toString());
	}
}
