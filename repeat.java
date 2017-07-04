import java.util.Arrays;
import java.util.Scanner;

public class repeat {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Numbers");
		for(int i=0;i<n;i++)
		{
			
			ar[i]=sc.nextInt();
		
	}
		Arrays.sort(ar);
	
		for(int i=1;i<n;i++)
		{
			
			if(ar[i-1]==ar[i])
			{
				System.out.println(ar[i]);
			}
		}
	}

}
