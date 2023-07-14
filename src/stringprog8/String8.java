package stringprog8;

import java.util.Scanner;

public class String8 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
        int sum=0;
        for (int i=0;i<=s1.length()-1;i++)
        {
        	char ch=s1.charAt(i);
        	boolean b=Character.isDigit(ch);
        	if (b==true)
        	{
        	    int k=Integer.parseInt(ch+"");
        		sum=sum+k;
        	}
        	
        }
        
        System.out.println(sum);
        //System.out.println();
	}

}
