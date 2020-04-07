package com.SoftServAcademy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
    	// #1
	String one = "House";
	String two = "Full house of House is full";
	boolean b = two.contains(one);
	System.out.println(b);

	// #2
		String name = "Bob";
		String surname = "Smith";
		String patronymic = "Andreyevich";
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter name: ");
//		name = scanner.nextLine();
//		System.out.println("Enter surname: ");
//		surname = scanner.nextLine();
//		System.out.println("Enter patronymic: ");
//		patronymic = scanner.nextLine();

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(surname).append(" ").append(name.charAt(0)).append(".")
				.append(patronymic.charAt(0)).append("."));
		System.out.println(name);
		sb.delete(0, sb.capacity());
		System.out.println(sb.append(name).append(", ").append(patronymic).append(" ").append(surname));

		// #3
		String name2;
		System.out.println("Enter name: ");
		Pattern pattern = Pattern.compile("([a-zA-Z0-9_]{3,15})");
		String temp = scanner.next();
		sb.delete(0, sb.capacity());
		Matcher matcher = pattern.matcher(temp);
		if (matcher.matches()) {
			sb.append(temp);
			name2 = sb.toString();
			System.out.println(name2);
		} else System.out.println("Invalid name. The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.");


		scanner.close();
    }
}
