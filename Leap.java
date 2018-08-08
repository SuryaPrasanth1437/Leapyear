package program;

import java.util.Scanner;

public class Leap
{

	public static void main(String[] args)
	{
		int n;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number ");
		n=nu.nextInt();
		if (n%4==0)
			System.out.println("the given year is leap year");
		else
			System.out.println("the given year is not leap year");
		nu.close();
	}

}
