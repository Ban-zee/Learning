import java.io.*;
class P44
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int n=Integer.parseInt(k.readLine());
		int i,j,x,m=n-1,b;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print("*");
			}
			for(x=1;x<=m;++x)
			{
				System.out.print(" ");
			}
			for(x=1;x<=m;++x)
			{
				System.out.print(" ");
			}
			for(b=1;b<=i;++b)
			{
				System.out.print("*");
			}
			System.out.println("");
			m--;
		}
	}
}