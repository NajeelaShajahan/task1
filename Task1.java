package com.ebrainpractice;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,i;
		System.out.println("enter 1st value : ");
		a=sc.nextInt();
		System.out.println("enter 2nd value : ");
		b=sc.nextInt();
		for(i=1;i<=b;i++)
		{
		System.out.println( a +" * "+ i +" = "+ (a*i));
		}
		// TODO Auto-generated method stub

	}

}
