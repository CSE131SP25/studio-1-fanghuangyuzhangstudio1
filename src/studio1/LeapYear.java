package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a year:");
		int year = in.nextInt();
		double result1 = year/4.0;
		int result1a = year/4;
		double result2 = year/100.0;
		int result2a =  year/100;
		boolean result1b = (result1==result1a)&&(result2!=result2a);
		System.out.println(year + " is a leap year: " + result1b);
		
		
	}

}
