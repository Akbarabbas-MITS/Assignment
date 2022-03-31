package com.seventh;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("User has entered : "+sc.nextLine());
			System.out.println("User has entered again : "+sc.nextLine());
		}
	}
}
