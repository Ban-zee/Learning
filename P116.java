import java.io.*;
class P116
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of m");
		int m=Integer.parseInt(k.readLine());
		int a[][]=new int[m][m];
		int b[][]=new int[m][m];
		int i,j;
		System.out.println("Enter the numbers");
		for(i=0;i<m;++i)
		{
			for(j=0;j<m;++j)
			{
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		for(i=0;i<m;++i)
		{
			for(j=0;j<m;++j)
			{
				b[i][j]=a[m-1-j][i];
			}
		}
		for(i=0;i<m;++i)
		{
			for(j=0;j<m;++j)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}