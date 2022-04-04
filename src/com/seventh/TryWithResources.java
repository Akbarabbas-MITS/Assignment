package com.seventh;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class TryWithResources {
	
	@Test
	public void testTry() {
		Scanner temp;
		try(Scanner sc = new Scanner(System.in)){
			temp = sc;
		}
		String expected = "Scanner closed";
        String actual = null;
        try {
            temp.nextLine();
        } catch (Exception e) {
            actual = e.getLocalizedMessage();
        }

        assertEquals(expected, actual);
	}
}
