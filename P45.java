import java.io.*;
class P45
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=n,x=n+1,u,c;
		for(i=1;i<=n;++i)
		{
			for(j=x;j>=1;--j)
			{
				System.out.print("8");
			}
			for(m=n;m>=x;--m)
			{
				System.out.print(" ");
			}
			for(m=n;m>=x;--m)
			{
				System.out.print(" ");
			}
			for(u=x;u>=1;--u)
			{
				System.out.print("8");
			}
			x--;
			System.out.println("");
		}
		x=n;
		for(i=1;i<=n+1;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print("8");
			}
			for(m=1;m<=x;++m)
			{
				System.out.print(" ");
			}
			for(m=1;m<=x;++m)
			{
				System.out.print(" ");
			}
			for(c=1;c<=i;++c)
			{
				System.out.print("8");
			}
			System.out.println("");
			x--;
		}
	}
}