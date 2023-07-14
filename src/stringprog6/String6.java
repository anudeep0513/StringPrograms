package stringprog6;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
        String s2="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		if (s1.contentEquals(s2))
		{
			System.out.println(s2);
		}
		else
		{
			System.out.println("not a panlindrom");
		}

	}

}
