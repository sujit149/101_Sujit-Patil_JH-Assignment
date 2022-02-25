package javafx.application;
import java.util.Scanner;



public class Application {
	public static void main(String[] args) {
		
		/*int r,temp;
		int sum = 0;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		temp = n;
		while(n>0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n/10;
			
		}
		
		if(temp == sum)
			System.out.println("number is palindrome");
		
		
		else
			System.out.println("number is not palindrome");*/


		
		
		
		
		
		
		
		
		
		
		
		
	// java program for lcm of two given number
		
	/*	 int i,m=0,flag=0;      
		  int n=3;    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  } */
		  
		  
		  
		 
		
		
		//program to find prime factors of given number
		  
		  
		  
		  int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	     
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }
		  
		
}

