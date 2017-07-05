
import java.util.Arrays;
import java.util.Scanner;

public class repe {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=s.split(" ");
		
		int[] ar=Arrays.stream(st).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(ar);

		for(int i=0;i<ar.length;i++)
		{
		
			if(i==0)
			{
				if(ar[i]!=ar[i+1])
				{
					System.out.println(ar[i]);
				}
			}
			else if(i==ar.length-1)
			{
				if(ar[i]!=ar[i-1])
				{
					System.out.println(ar[i]);
				}
			}
			else
			{
				if((ar[i]!=ar[i-1])&&(ar[i]!=ar[i+1]))
					System.out.println(ar[i]);
			}
	
		}
		
	}

}
