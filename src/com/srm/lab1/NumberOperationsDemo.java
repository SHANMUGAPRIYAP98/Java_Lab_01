package com.srm.lab1;

import java.util.Arrays;
import java.util.Scanner;

class NumberOper {
	boolean flag=false;
	void swapWithTemp(int a, int b) {
		System.out.println("Before Swapping : " + a + "\t" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping  : " + a + "\t" + b);
	}

	void swapWithoutTemp(int a, int b) {
		System.out.println("Before Swapping : " + a + "\t" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping  : " + a + "\t" + b);
	}

	void findSecondArrayElem(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("Second Largest Element : " + arr[arr.length - 2]);
	}

	void findSquareRoot(double value) {

		double res = Math.pow(value, 0.5);
		System.out.println("Square Root of " + value + " : " + res);
	}

	void reverse(int num) {
		int digits=0,rev=0;
		for(;num!=0;num=num/10)
		{
			digits=num%10;
			rev=rev*10+digits;
		}
		System.out.println("Reversed Number : "+rev);
	}
	void findArmstrong(int num)
	{
		int digits=0;
		int sum=0;
		int val=num;
		for(;num!=0;num=num/10)
		{
			digits=num%10;
			sum=sum+(digits*digits*digits);		
		}
		if(val==sum) {
			System.out.println(val+" is a Armstrong Number");
		}
		else
		{
			System.out.println(val+" is not a Armstrong Number");
		}
	}
	void addMatrix(int[][] mat1,int[][] mat2)
	{
		int[][] mat3=new int[3][3];
		System.out.println("Addition of Two Matrices : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(mat3[i][j]+"\t");
			}
			System.out.println();
		}
	}
	void checkPrime(int number)
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				System.out.println(number+" is not a prime number");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(number+" is  a prime number");
		}
	}
	int factorial(int number)
	{
		int fact=1;
		for(int count=1;count<=number;count++)
		{
			fact=fact*count;
		}
		return fact;
	}
	
    int fact(int n)
    {
    	int fval=0;
    	if(n==0||n==1)
    	{
    		fval=1;
    		return fval;
    	}
    	else
    	{
    		fval=n*fact(n-1);
    		return fval;
    	}
    	
}
}
public class NumberOperationsDemo {
	public static void main(String[] args) {
		NumberOper numOper = new NumberOper();
		System.out.println("1.Swap with Third Variable" + "\n2.Swap without Third Variable"
				+ "\n3.Second Highest Array Element" + "\n4.Square Root of a Number" + "\n5.Reversing a Number"+"\n6.Armstrong Number"+"\n7.Addition of Two Matrices"+"\n8.Prime Number"+"\n9.Factorial of a Given Number\n1.Iterative Way\n2.Recursive Way");
		System.out.println("Enter the Operation No to be Performed : ");
		try (Scanner sc = new Scanner(System.in)) {
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter the Number 1 : ");
				int a = sc.nextInt();
				System.out.println("Enter the Number 2 : ");
				int b = sc.nextInt();
				numOper.swapWithTemp(a, b);
				break;
			case 2:
				System.out.println("Enter the Number 1 : ");
				int num1 = sc.nextInt();
				System.out.println("Enter the Number 2 : ");
				int num2 = sc.nextInt();
				numOper.swapWithoutTemp(num1, num2);
				break;
			case 3:
				System.out.println("Enter the No.of.Array Elements : ");
				int size = sc.nextInt();
				int[] arr = new int[size];
				for (int i = 0; i < size; i++) {
					System.out.println("Enter the Element " + (i + 1));
					arr[i] = sc.nextInt();
				}
				numOper.findSecondArrayElem(arr);
				break;
			case 4:
				System.out.println("Enter the Number : ");
				double val = sc.nextDouble();
				numOper.findSquareRoot(val);
				break;
			case 5:
				System.out.println("Enter the Number : ");
				int num = sc.nextInt();
				numOper.reverse(num);
				break;
			case 6:System.out.println("Enter the Number : ");
				   int val1=sc.nextInt();
				   numOper.findArmstrong(val1);
				   break;
			case 7:int[][] mat1=new int[3][3];
			       int[][] mat2=new int[3][3];
			       System.out.println("Enter the Matrix 1 : ");
			       for(int i=0;i<3;i++)
			       {
			    	   for(int j=0;j<3;j++)
			    	   {
			    		   mat1[i][j]=sc.nextInt();
			    	   }
			       }
			       System.out.println("Enter the Matrix 2 : ");
			       for(int i=0;i<3;i++)
			       {
			    	   for(int j=0;j<3;j++)
			    	   {
			    		   mat2[i][j]=sc.nextInt();
			    	   }
			       }
			       numOper.addMatrix(mat1, mat2);
			       break;
			case 8:System.out.println("Enter the Number : ");
				   int number=sc.nextInt();
				   numOper.checkPrime(number);
				   break;
			case 9:System.out.println("Enter the Number : ");
			   	   int number1=sc.nextInt();
			   	   System.out.println("Enter the Approach Number : ");
			   	   int app=sc.nextInt();
			   	   if(app==1)
			   	   {
			   		   int fact=numOper.factorial(number1);
				   	   System.out.println("Factorial of "+number1+" is : "+fact); 
			   	   }
			   	   else
			   	   {
			   		int fact=numOper.fact(number1);
				   	System.out.println("Factorial of "+number1+" is : "+fact); 
			   	   }
			   	   break;
			
			}
		}

	}

}
