package stringprog1;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		String s2=s1.next();
		//int index=s1.nextInt();
		System.out.println(s2);
		for (int i=0;i<=s2.length()-1;i++)
		{
			char ch=s2.charAt(i);
			if (ch=='a')
			{
			    count++;
				
			}
		}
		System.out.println(count);

	}

}
