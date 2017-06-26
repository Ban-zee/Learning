import java.io.*;
class P86
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter m&n");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int i,j;
		System.out.println("Enter the values:");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				b[m-i-1][n-j-1]=a[i][j];
			}
		}
		System.out.println("The Original Matrix:");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("New Matrix is:");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}