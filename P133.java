import java.io.*;
class P133
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n");
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[n][n];
		int i,x=0,p=1,j;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n-x;++j)
			{
				a[i][j]=9*p++;
			}
			x++;
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