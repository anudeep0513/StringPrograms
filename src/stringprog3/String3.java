package stringprog3;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.next();
		System.out.println(s1);
		System.out.println("enter character");
		char ch=s.next().charAt(0);
		for (int i=0;i<=s1.length()-1;i++)
		{
			if (s1.charAt(i)==ch)
			{
				s1.indexOf(ch);
				System.out.println("Given character "+ch +" is present at the string");
			}
		}
	}

}
