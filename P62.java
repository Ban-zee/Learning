import java.io.*;
class P62
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=n-1;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=m;++j)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(j=1;j<m;++j)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				m--;
			if(i==n/2)
			{
				for(j=1;j<i*2;++j)
				{
					System.out.print(" ");
				}
				for(j=1;j<=i;++j)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}