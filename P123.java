import java.io.*;
class P123
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(k.readLine());
		char a[][]=new char [n][n];
		int i,j;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(j==(n-1)/2||i==1||i==2)
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
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
}