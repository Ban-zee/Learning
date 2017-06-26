import java.io.*;
class P58
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=n-1;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=m;++j)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;++j)
			{
				System.out.print("x"+" ");
			}
			m--;
			System.out.println("");
		}
		m=n-1;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print(" ");
			}
			if(i!=n)
			{
				for(j=1;j<=m;++j)
				{
					System.out.print("x"+" ");
				}
			}
			System.out.println("");
			m--;
		}
	}
}