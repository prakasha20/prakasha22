import java.util.Arrays;
import java.util.Scanner;

public class pos {
	
	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of elements");
	int n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
		
	}
	Arrays.sort(ar);
	for(int i=0;i<n;i++)
	{
		if(ar[i]==i)
		{
			System.out.println("the number"+ar[i]+" equqls its position "+i);
			
		}
	}
}

}
