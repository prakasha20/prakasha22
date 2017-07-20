
import java.util.Scanner;
public class by {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
		for(int i=0;i<Math.pow(2, n);i++)
		{ String s = Integer.toBinaryString(i);
			String r =new String();
			if(s.length()<n)
			{for(int j=0;j<n-s.length();j++)
				{
					r+=String.valueOf(0);	
				}
				r+=s.toString();
				System.out.println(r);
			}
			else
				System.out.println(s);
	   }
   }
}

