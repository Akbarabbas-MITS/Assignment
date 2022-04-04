package com.sixth;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindEvenSquare {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println("Before square");
		nums.stream().forEach(i->System.out.println(i));
		nums = nums.stream().filter(i->i%2==0).map(i -> i*i).collect(Collectors.toList());
		System.out.println("After filtering and squaring");
		nums.stream().forEach(i->System.out.println(i));
	}
	
	public static List<Integer> getEvenSquares(List<Integer> nums){
		return nums.stream().filter(i->i%2==0).map(i -> i*i).collect(Collectors.toList());
	}
	
	@Test
    public void squareOfAllEven() {
        List<Integer> expected = Arrays.asList(4, 16, 36, 64);
        List<Integer> actual = getEvenSquares(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(actual);

        assertEquals(expected, actual);
    }
}
