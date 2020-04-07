package com.SoftServAcademy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String createName (String name) {
        if (nameValidation(name)) {
			System.out.println(name + " name created");
        	return name;
        } else {
			System.out.println("Invalid name. The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.");
			return null;
		}
    }

    private static boolean nameValidation (String name) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9_]{3,15})");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        } else return false;
    }

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
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(surname).append(" ").append(name.charAt(0)).append(".")
				.append(patronymic.charAt(0)).append("."));
		System.out.println(name);
		sb.delete(0, sb.capacity());
		System.out.println(sb.append(name).append(", ").append(patronymic).append(" ").append(surname));

		// #3
		createName("bob_2");
		createName("bo");
		createName("bob_2gdsfsdfsdf");
		createName("bob_3");
		createName("bob_6");
    }
}
