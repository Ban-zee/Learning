import java.io.*;
class P95
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of matrix");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=(n-1)/2,c=0;
		int a[][]=new int[n][n];
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]=++c;
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if((i+j)==m||(i+j)==m*3||(i-j)==m||(j-i)==m)
				{
					System.out.print(" "+"\t");
				}
				else
				{
					System.out.print(a[i][j]+"\t");
				}
			}
			System.out.println("");
		}
		for(i=1;i<=n;++i)
		{
			System.out.print("__"+"\t");
		}
		System.out.println("");
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if((i+j)==m||(i+j)==m*3||(i-j)==m||(j-i)==m)
				{
					System.out.print(a[i][j]+"\t");
				}
				else
				{
					System.out.print(" "+"\t");
				}
			}
			System.out.println("");
		}
	}
}