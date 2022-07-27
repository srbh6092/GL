package com.globallogic.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.globallogic.training.collections.Employee;

public class StreamAPI {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Saurabh", 5000));
		list.add(new Employee("Abc", 2000));
		list.add(new Employee("Singh", 2000));
		list.add(new Employee("Def", 2500));
		list.add(new Employee("Xyz", 3900));
		System.out.println("Employees:");
		System.out.println("------------------------------------");
		list.stream().forEach(System.out::println);
		List<Employee> collectedEmpList = (List<Employee>) list.stream()
				.filter(e -> e.getSalary() >= 2500)
				.sorted((a,b)->a.compareTo(b))
				.collect(Collectors.toList());
		System.out.println();
		System.out.println("Employees with salary 2500 or above \n(in sorted order of thier name):");
		System.out.println("------------------------------------");
		for(Employee e: collectedEmpList)
			System.out.println(e);
	}
}