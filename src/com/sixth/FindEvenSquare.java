package com.sixth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenSquare {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println("Before square");
		nums.stream().forEach(i->System.out.println(i));
		nums = nums.stream().filter(i->i%2==0).map(i -> i*i).collect(Collectors.toList());
		System.out.println("After filtering and squaring");
		nums.stream().forEach(i->System.out.println(i));
	}
}
