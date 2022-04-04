package com.fifth;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindSquare {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println("Before square");
		nums.stream().forEach(i->System.out.println(i));
		nums = nums.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println("After square");
		nums.stream().forEach(i->System.out.println(i));
	}
	
	public static List<Integer> getSquare(List<Integer> nums) {
		return nums.stream().map(i -> i*i).collect(Collectors.toList());
	}
	
	@Test
    public void testSquare() {
        List<Integer> expected = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81);
        List<Integer> actual = getSquare(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(getSquare(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        assertEquals(expected, actual);
    }

}
