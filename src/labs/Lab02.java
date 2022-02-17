package labs;

import java.util.Scanner;

public class Lab02 {

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
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int x1 = input;
		int x2 = input2;
		
		max = Math.max(max, x1);
		max = Math.max(max, x2);
		min = Math.min(min, x1);
		min = Math.min(min, x2);
		
		int scope = max - min + 1;
		
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * scope + scope);
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a radious of a cylinder: ");
		int radious = inKey.nextInt();
		
		System.out.print("Enter a height of a cycle: ");
		int height = inKey.nextInt();
		
		double num = Math.pow(radious, 2);
		
		double volume = Math.PI * num * height;
		
		System.out.print("The volum of cylinder is " + volume + ".");
		
		System.out.println("\n");
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter x1: ");
		double x1 = inKey.nextInt();
		System.out.print("Enter y1: ");
		double y1 = inKey.nextInt();
		
		System.out.print("Enter x2: ");
		double x2 = inKey.nextInt();
		System.out.print("Enter y2: ");
		double y2 = inKey.nextInt();
		
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		System.out.println("Distance between points = " + distance + "\n");
		
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a-value: ");
		int a = inKey.nextInt();
		System.out.print("Enter b-value: ");
		int b = inKey.nextInt();
		System.out.print("Enter c-vale: ");
		int c = inKey.nextInt();
		
		double x1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		double x2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		x1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
		System.out.println("x1 = " + x1);
		
		x2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
		System.out.print("x2 = " + x2);
		
		
		
	}
	
	

	
}
