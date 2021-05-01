package com.srm.lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class StringData {
	void revString(String data) {
		String rev = "";
		for (int i = data.length() - 1; i >= 0; i--) {
			rev = rev + data.charAt(i);
		}
		System.out.println("Reversed String : " + rev);
	}

	void reverse(String data) {
		StringBuilder sb = new StringBuilder(data);
		System.out.println("Reversed String : " + sb.reverse());
	}

	void palindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		if (rev.equals(str)) {
			System.out.println(rev + " is a palindrome");
		} else {
			System.out.println(rev + " is not a palindrome");
		}
	}

	void checkAnagram(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		char[] ch1 = new char[len1];
		char[] ch2 = new char[len2];
		ch1 = s1.toCharArray();
		ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams to each other");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams to each other");
		}
	}

	void findDupChar(String val) {
		char[] ch = val.toCharArray();
		for (int i = 0; i < val.length(); i++) {
			for (int j = i + 1; j < val.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j] + "\t");
					break;
				}
			}
		}
	}

	void findNonRepChar(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] != ch[j]) {
					System.out.println(ch[i] + " is first non-repeated character");
					break;
				}
				break;
			}
			break;
		}
	}

	Set<String> findPermutation(String str) {
		Set<String> permutations = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			permutations.add("");
			return permutations;
		}
		char first = str.charAt(0);
		String sub = str.substring(1);
		Set<String> words = findPermutation(sub);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
			}
		}
		System.out.println("Permuted Values : "+permutations);
		return permutations;
	}
}

public class StringOperations {

	public static void main(String[] args) {
		StringData sd = new StringData();
		System.out.println("\t\t\tSTRING OPERATIONS");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1.String Reverse without Built-In Function"
					+ "\n2.String Reverse with Built-In Function" + "\n3.String Palindrome" + "\n4.String Anagrams"
					+ "\n5.Duplicate Characters in String" + "\n6.First Non-Repeated Character"+"\n7.Permutations of a Given String");
			System.out.println("Enter the Operation Number to be Performed : ");
			int op = sc.nextInt();
			switch (op) {

			case 1:
				sc.nextLine();
				System.out.println("Enter the String : ");
				String data = sc.nextLine();
				sd.revString(data);
				break;
			case 2:
				sc.nextLine();
				System.out.println("Enter the String : ");
				String s1 = sc.nextLine();
				sd.reverse(s1);
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter the String : ");
				String str = sc.nextLine();
				sd.palindrome(str);
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter the String 1 : ");
				String str1 = sc.nextLine();
				System.out.println("Enter the String 2 : ");
				String str2 = sc.nextLine();
				sd.checkAnagram(str1, str2);
				break;
			case 5:
				sc.nextLine();
				System.out.println("Enter the String : ");
				String val = sc.nextLine();
				sd.findDupChar(val);
				break;
			case 6:
				sc.nextLine();
				System.out.println("Enter the String : ");
				String val1 = sc.nextLine();
				sd.findNonRepChar(val1);
				break;
			case 7:
				sc.nextLine();
				System.out.println("Enter the String : ");
				String dt = sc.next();
				sd.findPermutation(dt);
				break;
			default:
				System.exit(0);

			}
		}
	}

}
