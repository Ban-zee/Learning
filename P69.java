import java.io.*;
class P69
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		int n=Integer.parseInt(k.readLine());n=n/3;
		int i,j,m=n-1,x=n;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=m;++j)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;++j)
			{
				System.out.print("*");
			}
			if(i!=1)
			{
				for(j=1;j<i;++j)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
			m--;
		}
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=n*2;++j)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		m=0;
		for(i=1;i<=n;++i)
		{
			for(j=n;j>=m+1;--j)
			{
				System.out.print("*");
			}
			if(i!=1)
			{
				for(j=0;j<m*2;++j)
			{
				System.out.print(" ");
			}
		}
			for(j=n;j>=m+1;--j)
			{
				System.out.print("*");
			}
			m++;
			System.out.println("");
		}
	}
}