import java.io.*;
class P55
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=n-1;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print("~");
			}
			for(j=1;j<=m*2;++j)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;++j)
			{
				System.out.print("~");
			}
			m--;
			System.out.println("");
		}
		m=n-2;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print(" ");
			}
			for(j=1;j<=m+1;++j)
			{
				System.out.print("~");
			}
			for(j=1;j<=m+1;++j)
			{
				System.out.print("~");
			}
			System.out.println("");
			m--;
		}
	}
}