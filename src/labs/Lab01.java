package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		double num = Math.pow(input, input2);
		System.out.println(input + "^" + input2 + " = " + num + "\n");	
	}
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		
		double num = Math.sqrt(input);
		System.out.println(num);
		
		
		System.out.println("The square root of " + input + " is " + num + "\n");
	}

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Length of side A: ");
		int input = inKey.nextInt();
		
		System.out.print("Length of side B: ");
		int input2 = inKey.nextInt();
		
		double num = Math.pow(input, 2);
		double num2 = Math.pow(input2, 2);
		
		double add = num + num2;
		
		double num3 = Math.sqrt(add);
		System.out.println(num3 + "\n");
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		
		int input = 1;
		boolean not0 = true;
		
		while (not0) {
			System.out.print("Enter an integer: ");
			input = inKey.nextInt();
			if (input == 0) {
				not0 = false;
			} else {
				if (input > max) {
					max = input;
				}
				else if (input < min) {
					min = input;
				}
			}
				
			}
		System.out.println("Max = " + min );
		System.out.print("Min = " + max);
		}
		
		
		
		
	}

