import java.io.*;
class P81
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of matrix");
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.println("Enter the value");
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		System.out.println("The Original Matrix is:");
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("The Mirror Image is:");
		for(i=0;i<n;++i)
		{
			for(j=n-1;j>=0;--j)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}