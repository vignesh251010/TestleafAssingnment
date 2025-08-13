package week1.day1h;

import java.util.Scanner;

public class fibonacci {
	public static void main (String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n= scan.nextInt();
		int f=0; 
		int s = 1;
		for (int i=1;i<=n;i++) {
			System.out.print(f+" ");
			int add = f+s;
			f=s;
			s=add;

			
		}
		
		scan.close();
		
	}
	

}
