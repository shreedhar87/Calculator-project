package com.calculator;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		CalculaterImpl cal=new CalculaterImpl();

		while(true) {
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit from calculater\n\nEnter the choice");

			int choice=scanner.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter the 2 numbers");
				int a=scanner.nextInt();
				int b=scanner.nextInt();

				System.out.println(cal.add(a, b));
				break;
			case 2:
				System.out.println("Enter the 2 numbers");
				int a1=scanner.nextInt();
				int b1=scanner.nextInt();

				System.out.println(cal.sub(a1, b1));
				break;
			case 3:
				System.out.println("Enter the 2 numbers");
				int a11=scanner.nextInt();
				int b11=scanner.nextInt();

				System.out.println(cal.mul(a11, b11));
				break;
			case 4:
				System.out.println("Enter the 2 numbers");
				int a111=scanner.nextInt();
				int b111=scanner.nextInt();

				System.out.println(cal.div(a111, b111));
				break;
			case 5:
				System.exit(0);
				break;
			case 6:
				System.out.println(cal.errorMsgDisplay());
				break;
			default:
				System.out.println("invalid choice");

			}
		}
	}
}
