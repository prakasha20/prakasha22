public class firstrepeat {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the the no of Elements");
		int n=s.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			boolean flag = false;
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				break;
			}
		}
	}

}
