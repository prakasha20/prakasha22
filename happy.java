import java.util.Scanner;

public class happy
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=a,sum=0;
		while(n>0)
		{
			sum+=(n%10)*(n%10);
			n=n/10;
			if((sum<10)&&(n==0))
			{
				break;
			}
			if(n==0)
			{
				n=sum;
				sum=0;
			}
		}
		if(sum==1)
			System.out.println("it is an free number");
		else
			System.out.println("not an free number");
	}

}
