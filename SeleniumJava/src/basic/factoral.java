package basic;

import java.util.Scanner;

public class factoral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		
		int temp =1;
		while(number!=0)
		{
			int rem = number%10;  //123 12
			temp = temp*rem;			  //3*2
			
			number
			
			= number/10; //12   1
		}
		
		System.out.println(temp);
	}
}
