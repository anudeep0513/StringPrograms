package stringprog9;

import java.util.Scanner;

public class String9 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		    String s2[]=s1.split(" ");
			try {
			for (int i=0;i<=s1.length()-1;i++)
			{
		System.out.println(s2[i]);
			}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("");
			}
	}

}
