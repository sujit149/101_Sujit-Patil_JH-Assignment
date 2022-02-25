package Assignmentno1;
import java.util.Scanner;

public class Assignment1 {
	public static void main1(String args[]) {
	
		/*	
		 // To check even /odd number 
		 
		 int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. to check");
		a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}*/

	
	
	
	
	
	
	// Factorial of given number
		
	
	
	/*int fact = 1;
	int n;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number whose factorial to be calculated");
	n = s.nextInt();
	for(int i = 1;i <= n;++i) {
		fact = fact * i;
		
	}
	System.out.println("Factorial of number is" + "" +fact );*/
	
	
	
	
	
	

	
	
	
	
	//Factorial of given number using Recursion
		
	/*static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		else {
			return(n*fact(n-1));
		}
	}
		
		public static void main1(String args[]) {
			int i,factorial=1;
			int c = 4;
			factorial = fact(c);
			System.out.println("Factorial of number is"+ factorial);			
		}
		
	}*/
	
	
	
	
	//Swap two numbers approach 1
		
		
		/*int a,b,c =1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be Swapped");
		
		a = s.nextInt();
		b = s.nextInt();
		
		c= a;
		a= b;
		b= c;
		System.out.println("Swapped numbers are"+ " "+a +" "+b);*/
	
	
	
	
	
	
	
	
	// Swapping of two numbers Approach2
		
	/*	int a,b = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the to be swapped");
		a = s.nextInt();
		b = s.nextInt();
		
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("Value of a =" + " " +a+" " +"value of b="+ " "+b);*/
		
		
		
		
	
		
		// given number is positive or negative
	/*	int a,b= 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		a = s.nextInt();
		if(a>0) {
			System.out.println("given number is even number");
			
		}
		
		else if(a<0){
			System.out.println("Given number is odd");
		}
		
		else {
			System.out.println("Given number is 0");
		}*/
		
		
		
		
		//Program to find Leap year or not
		
		
		/*int year;
		boolean leap = false;
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
		
		if(year%4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap =true;
				}
				
				else
					leap = false;
				
				
			}
			else
				leap= true;
		}
		
		else
			leap = false;
		
		if(leap)
			System.out.println(year +  "Year is leap year");
		else
			System.out.println(year +   "Year is not a leap year");*/
		
		
		
		
	
		
		
		
		//To print 1 to 10 without using loop
		
		/*static void loop(int n) {
			if(n>0) {
				
				loop(n-1);
				System.out.println(n +" ");			}
			return;
			
		}
		
		public static void main2(String args[])
		{
			loop(10);
		}
		
		
		
	
	
	
	}*/


		
		
		// to print digits of of given number
		
		/*int num = 20345;
		while(num>0) {
			int remain = num % 10;
			System.out.println(remain);
			num = num/10;
		}*/
		
		
		
		
		
		//To print factors of given number
		
	/*	int n ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		n = s.nextInt();
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}*/
		
		
		
		
		
		
		
		
		//To print sum of digit of given number
	/*	int num = 20345;int remain = 0;
		while(num>0) {
			 remain =remain + num%10;
			 
			num = num/10;
			
		}
		System.out.println("Sum of digit is ="  +remain);*/
		
	
	
	
	
		
		//To find smallest of three numbers
		
		
		/*int a,b,c,temp,small;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		
		temp = a<b ? a:b;
		small = temp<c ? temp:c;
		System.out.println("Smaller number is" + small);*/
		
		
		
		
		//To add two number without using arithmatic operator
		
		/*int a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		for(int i = 1; i<=b;i++) {
			a++;
			
		}
		System.out.println("sum of two number is ="  +a);*/
		
		
		
		
		//write a program to reverse a given number
		int number;
		int reverse = 0;
		
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		while(number != 0) {
		int remainder = number % 10;
		reverse = reverse * 10 + remainder;
		number = number/10;
		
		
		}
		System.out.println("reverse of given number is"  + reverse);
	
	}
}
