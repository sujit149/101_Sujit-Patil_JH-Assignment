package AssignmentNo2;
import java.util.Scanner;

public class AssgNo2 {

	public static void main(String[] args) {
		
		//Average of Given array
		
		/*int num ;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		num = s.nextInt();
		
    int [] a = new int [num];
    System.out.println("Enter the element of array");
    
    
    for(int i = 0;i<a.length;i++) {
    	
    	a[i] = s.nextInt();
    	
    }
    
    double avg = 0;
    for(int i = 0;i<num;i++) {
    	avg = avg + a[i];
    }
    avg = avg/num;
    System.out.println("Average of given no  ="  +avg);*/
    
    
    
		
		
		
		
		
		//Find the second largest number in array
		
		/*int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		num = sc.nextInt();
		
		int a[] = new int [num];
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int max = 0;
		
		max = a[0] ;
		for(int i = 0;i<num;i++)
		{
			if(a[0]< a[i])
			{
			max = a[i];	
			
			}
			max = a[num-1];
		}
		
		System.out.println("Second largest number is =" +max);*/
		
		
		
		//Second minimum number in given array
		
		/*int temp,size,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		num = sc.nextInt();
		int a[] = new int[num];
		for(int i = 0;i<a.length;i++) {
			
			a[i] = sc.nextInt();
		}
		
		for(int i = 0;i<num;i++) {
			for(int j = i+1;j<num;j++) {
				
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
					
				}
				
			}
			
		}
		
		System.out.println("second smallest number is" +a[0]);*/
		
		
		
		
		
		
		
		//Find the missing number in the array
		
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int [n]; 
		System.out.println("Enter (n-1) numbers");
		for(int i = 0;i<n-1;i++) {
			a[i] = s.nextInt();
		}
		int sumOfAll = (n*(n+1))/2;
		int sumOfArray = 0;
		for(int i = 0;i<=n-1;i++) {
			sumOfArray = sumOfArray + a[i];
		}
		
		int missNo = sumOfAll - sumOfArray;
		System.out.println("missing number is ="  +missNo);*/
		
		
		
		
		// java program to find intersection of two numbers
		
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of a array");
		int a = s.nextInt();
		
		
		int c[] = new int[a];
		for(int i = 0;i<c.length;i++) {
			c[i] = s.nextInt();
		}
		
		
		System.out.println("Enter the size of a array");
		int b = s.nextInt();
		int d[] = new int[b];
		for(int i = 0;i<d.length;i++) {
			
			d[i] = s.nextInt();
			
		}
		
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<d.length;j++) {
				if(c[i] == d[j]) {
					System.out.println(d[j]);
				}
			}
		}*/
		
		
		
		//java program to find union of two array
		
		
		/*int v = 0,p = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of a array");
		int a = s.nextInt();
		
		
		int c[] = new int[a];
		for(int i = 0;i<c.length;i++) {
			c[i] = s.nextInt();
		}
		
		
		System.out.println("Enter the size of a array");
		int b = s.nextInt();
		int d[] = new int[b];
		for(int i = 0;i<d.length;i++) {
			
			d[i] = s.nextInt();
			
		}
		for(int i =0 ; i<c.length;i++) {
			System.out.println("Element of first array ="  +c[i]);
		}
    
		
		for(int j =0 ; j<d.length;j++) {
			System.out.println("Element of second array ="  +d[j]);
		}
		
		System.out.println("line of intersection");
		while(v<a && p<b) {
			
			if(c[v] < d[p])
				v++;
			else if(d[p]<c[v])
				
				p++;
			
			else {
				System.out.println(d[p++]+ " ");
			}
			
		}*/
		
		
		//using sorted form union of two array
		
		/*int arr1[] = {2, 4, 6, 8, 9};
	      int arr2[] = {1, 3, 4, 5, 6, 8, 9};
	      int m = arr1.length;
	      int n = arr2.length;
	      int i = 0, j = 0;
	      System.out.print("Array 1: ");
	      for(int k = 0; k < m; k++) {
	         System.out.print(arr1[k] + " "); 
	      }
	      System.out.print("\n");
	      System.out.print("Array 2: ");
	      for(int k = 0; k < n; k++) {
	         System.out.print(arr2[k] + " ");
	      }
	      
	      System.out.println("Intersection of two arrays is: ");
	      while (i < m && j < n) {
	         if (arr1[i] < arr2[j])
	            i++;
	         else if (arr2[j] < arr1[i])
	            j++;
	         else {
	            System.out.print(arr2[j++]+" ");
	            i++; 
	         }
	      }*/
		
		
		
		//program to move all zero to the the end of array
		
       /* int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int num = s.nextInt();
		
		int a[] = new int[num];
		int len = a.length;
		for(int i = 0; i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("The array element are"  +a[i]);
			

		}
		 
		         
		         for(int i = 0; i < len; i++) {
		             if(a[i] != 0) {
		                a[count++] = a[i];
		              }
		          
		 
		          
		          while(count < len) {
		             a[count++] = 0;
		          }
		         
		          for(int j = 0; j < len; j++) {
		             System.out.print(a[j] + " ");
		          }
		     }*/
				
			
			
		
		         
		         
		         //java program to reverse the given  array without using additional array
		
		         /* int temp,res = 0;
		         Scanner s = new Scanner(System.in);
		         System.out.println("Enter the size of array");
		         int n = s.nextInt();
		         
		         int a[] = new int[n];
		         int j = a.length;
		         
		         for(int i = 0;i<n;i++) {
		        	 a[i] = s.nextInt();
		         }
		         for(int i = 0;i<n;i++,n--) {
		        	 
		        	 temp = a[i];
		        	 a[i] = a[n-1];
		        	 a[n-1]= temp;
		        	 
		         }
		         System.out.println("reverse of array is");
		         for(int i=0;i<a.length;i++)
		         {
		        	 System.out.println(a[i]);
		         }*/
		
		
		
		//write program to find most frequent element in array
		
		
		
		/*int arr[] = new int[] {1,2,3,4,2,2,2,5,1};
		int fr[] = new int[arr.length];
		
		int visited = -1;
		for(int i = 0;i<arr.length;i++) {
			
			int count = 1;
			
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] ==arr[j]) {
					count++;
					
					fr[j] = visited;
					
				}
			}
			
			if(fr[i] != visited)
				fr[i] = count;
		}
                    
        System.out.println("-----------");
        System.out.println("Element | Frequency");
        
        
        for(int i = 0;i<fr.length;i++) {
        	if(fr[i] != visited)
        		System.out.println(" "+arr[i]+ " |"+ fr[i]);
        }*/
                    
		
		
		//to check given string is palindrome or not
		
		/*String[] a = new String[] {"sujit"};
		int n = a.length;
		System.out.println(n);
		
		//for(int i=1;i>0;i--) {
			//System.out.println("reverse of array is" +a[i]);*/
		
		/*String s = "NITIN";
		String reverse = new StringBuffer(s).reverse().toString();
		if(s.equals(reverse))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");*/
		
		
		
		
		
		//swap two string without using third variable
		
		
		/*String a = "Love";
		String b = "you";
		System.out.println("Before swap :" +a+ "" +b);
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After :" +a+ "" +b);*/
		
		
		
		
		
		
		//write a java program to reverse string without using in build function
		
		/*String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();                   
		System.out.print("After reverse string is: ");  
		for(int i=s.length();i>0;--i)            
		{  
		System.out.print(s.charAt(i-1));        
		} */
		
		
		
		
		//java program to rotate given array d time
	
		}
		
	}


