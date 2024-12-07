import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
class one
	{
	int add()
		{
			int c;
			Scanner obj1 = new Scanner(System.in);

			System.out.print("Enter the Number :");
			int a = obj1.nextInt();

			System.out.print("Enter the Number :");
			int b = obj1.nextInt();

			c = a+b;
			System.out.println("The Sum is :"+c);
			return c;
		}
	}
 
class two extends one
	{
	int sub()
		{
		int f;
		Scanner obj2 = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int d = obj2.nextInt();
	
		System.out.print("Enter the Number :");
		int e = obj2.nextInt();

		f = d-e;
		System.out.println("The Difference is :"+f);
		return f;
		}
	}
class singleinherit
	{
		public static void main(String[] args)
			{
			two obj = new two();
			Scanner obj3 = new Scanner(System.in);
			System.out.println("Option **1** ADDITION");
			System.out.println("Option **2** SUBTRACTION");
			System.out.print("Enter your option :");
			int opt = obj3.nextInt();


			switch(opt)	
				{
				case 1:
				obj.add();
				break;
				case 2:
				obj.sub();
				break;
				default:
				System.out.println("Enter Correct option");
				}
			}
	}


