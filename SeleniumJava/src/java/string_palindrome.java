package java;

import java.util.Scanner;

public class string_palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String word = sc.next();
		char[] ch = word.toCharArray();
		System.out.println(word.length());
		
		for(int A=0;A<=word.length()-1;A++)
		{
			System.out.println(A);
		}
		
	}
}
