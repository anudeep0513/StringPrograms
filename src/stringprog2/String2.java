package stringprog2;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		String s2=s1.next();
		int counta=0;
		int counte=0;
		int counti=0;
		int counto=0;
				int countu=0;
		System.out.println(s2);
		for (int i=0;i<=s2.length()-1;i++)
		{
			char ch=s2.charAt(i);
			if (ch=='a'|| ch=='A')
			{
				counta++;
			}
			else if (ch=='e'|| ch=='E')
			{
				counte++;
				
			}
			else if (ch=='i'|| ch=='I')
			{
				counti++;
				
			}
			else if (ch=='o' || ch=='O')
			{
				counto++;
				
			}
			else if(ch=='u' || ch=='U')
			{
				countu++;
				
			}
				
		}
		System.out.println("a repeated in the string is "+counta);
		System.out.println("e repeated in the string is "+counte);
		System.out.println("i repeated in the string is "+counti);
		System.out.println("o repeated in the string is "+counto);
		System.out.println("u repeated in the string is "+countu);

	}

}
