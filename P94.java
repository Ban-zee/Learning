import java.io.*;
class P94
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter m&n");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[m][n];
		int i,j,d=0;
		System.out.println("Enter the values:");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]=++d;
			}
		}
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				if(i==0||j==0||i==m-1||j==n-1)
				{
					System.out.print(a[i][j]+"\t");
				}
				else
				{
					System.out.print(" "+"\t");
				}
			}
			System.out.println("\t");
		}
	}
}