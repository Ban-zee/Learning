import java.io.*;
class P154
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n");
		int n=Integer.parseInt(k.readLine());
		char a[][]=new char[n][n*2];
		int i,j,m=n,u=0;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n*2;++j)
			{
				a[i][j]='*';
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n*2;++j)
			{
				int x=(int)Math.abs(i-j);
				int y=(int)Math.abs(j-i);
				if((i+j)==m||x==m||y==m)
				{
					u++;
				}
				else
				{
					a[i][j]=' ';
				}
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n*2;++j)
			{
				if(a[i][j]!=' ')
				{
					System.out.print(a[i][j]+"  ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n*2;++j)
			{
				a[i][j]='*';
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n*2;++j)
			{
				if(j==0||j==n*2-1)
				{
					u++;
				}
				else
				{
					a[i][j]=' ';
				}
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n*2;++j)
			{
				if(a[i][j]!=' ')
				{
					System.out.print(a[i][j]);
				}
				else
				{
				    System.out.print(" ");
				}
			}
		System.out.println("");
		}
	}
}