import java.util.Arrays;
import java.util.Scanner;

public class nearzero 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] st=s.split(" ");
	int min =10000,temp=0,a=0,b=0;
	
	int n=st.length;
	int[] ar=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=Integer.parseInt(st[i]);
		
	}
Arrays.sort(ar);

int as[]=new int[n];
int ap[]=new int[n];
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
	temp=ar[i]+ar[j];
	
	
	if(Math.abs(temp)<min)
	{
		min=temp;
		a=ar[i];
		b=ar[j];
		
	}

	}
}
System.out.println(a+" "+b);


}
}
