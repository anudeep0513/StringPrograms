package stringprog12;

public class String12 
{
        public static void main (String[] args)
		{
			// TODO Auto-generated method stub
		    String s="my my name is is narendra";
		    System.out.println(s);
		    String[] s1=s.split(" ");
		   // System.out.print(s1[4]);
		    for (int i=0;i<=s1.length-1;i++)
		    {
		    	for (int j=1;j<=s1.length-1;j++)
		    	{
		    		if (s1[i]==s1[j])
		    		{
		    			//System.out.println("skjdlfhuerj");
		    			for (int k=1;k<=s1.length-1;k++)
		    			{
		    				s1[k]=s1[k+1];
		    				System.out.println(s1[k]);
		    			}
		    		
		    		} 
		    		
		    	}
		    }

		}
}



