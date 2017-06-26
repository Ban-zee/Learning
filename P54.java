import java.io.*;
class P54
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=n-1,s=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;++j)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;++j)
			{
				System.out.print(j);
			}
			if(i!=1)
			{
				for(j=1;j<i;++j)
				{
					System.out.print(j);
				}
			}
			m--;
			System.out.println("");
		}
	}
}