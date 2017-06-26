import java.io.*;
class P138
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any odd integer n");
		int n=Integer.parseInt(k.readLine());
		char a[][]=new char[n][n];
		int i,j,m=(n-1)/2;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]='*';
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if((i<=m&&j==0)||i==m||(j==n-1&&i>=m)||(i==n-1&&j<=m)||(j==m)||(i==0&&j>=m)||(i==j)||(i+j)==n-1)
				{
					System.out.print(a[i][j]+"");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("\t");
		}
	}
}