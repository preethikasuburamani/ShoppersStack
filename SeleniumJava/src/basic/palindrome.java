package basic;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String word = sc.next();
		
		char[] arr = word.toCharArray();
		
		String temp = "";
		
		for(int i = arr.length-1;i>=0;i--)
		{
			temp =temp +arr[i];
		}

		System.out.println(temp);
	}

}
