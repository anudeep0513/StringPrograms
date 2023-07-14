package stringprog5;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		//System.out.println(s1);
		System.out.print(s1.charAt(0));
		for (int i=s1.length()-2;i>=1;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println(s1.charAt(s1.length()-1));
	}

	}

