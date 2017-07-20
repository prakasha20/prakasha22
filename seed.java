import java.util.Scanner;
public class seed {
	public static void main(String[] arg)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int a=i,r=1;
		while(a>0)
		{
			r*=a%10;
			a=a/10;
		}
		int f=r;
		r*=i;
		if(r==n)
		{
			System.out.println("seed"+i);
		}
	}
	}

}
