 import java.io.*;
class P52
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=n-1,x;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=m;++j)
			{
				System.out.print(" ");
			}
			for(x=1;x<=i;++x)
			{
				System.out.print(i+" ");
			}
			m--;
			System.out.println("");
		}
	}
}