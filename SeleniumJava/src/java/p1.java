package java;

import java.util.Scanner;

public class p1 {

public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a word");
	String word = sc.next();
	char[] arr = word.toCharArray();
	System.out.println(word.length());
	
	String temp = "";
	
	for(int i = arr.length-1;i<=0;i++)
	{
		System.out.println(arr[i]);
	}

}
}
