package stringprog13;

public class String13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="html sql css";
		System.out.println(s1);
		String[] s2=s1.split(" ");
		//System.out.println(s2);
		try
		{
		for (int i=0;i<=s2.length-1;i++)
		{
			for (int j=s2[i].length()-1;j>=0;j--)
			{
				System.out.println(s2[j]);
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("nani");
		}

	}

}
