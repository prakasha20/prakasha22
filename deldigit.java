import java.util.Arrays;
import java.util.Scanner;

public class deldigit {
	public static void main(String[] args)
	{
		
	
	String s=new String();
	Scanner sc=new Scanner(System.in);
	s=sc.next();
	char[] ar=s.toCharArray();
	Arrays.sort(ar);
	int k=sc.nextInt();
	if(k<s.length())
	{
	for(int i=0;i<s.length()-k;i++)
		System.out.print(ar[i]);
	}
	else
	{
		System.out.println("enter valid inputof K");
	}
}
}
