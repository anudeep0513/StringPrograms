package stringprog4;


public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="html";
		String s2=s1.toUpperCase();
		String s3="";
		System.out.println(s2);
		for (int i=s2.length()-1;i>=0;i--)
		{
			char ch=s2.charAt(i);
			 s3=""+s3+ch;
		}
		System.out.println(s3);
	}

}
