import java.io.*;
class P157
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n");
		int n=Integer.parseInt(k.readLine());
		char a[][]=new char[n][n];
		int i,j;
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
				if((i==0)||(i==n-1)||(i-j)==0||(i+j)==n-1)
				{
					a[i][j]='*';
				}
				else
				{
					a[i][j]=' ';
				}
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}