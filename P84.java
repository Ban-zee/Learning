import java.io.*;
class P84
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter m&n");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[m][n];
		int b[][]=new int[n][m];
		int i,j,x=n,u;
		System.out.println("Enter the values:");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		for(i=0;i<n;++i)
		{
			u=0;
			for(j=0;j<m;++j)
			{
				b[i][j]=a[u][x-1];
				u++;
			}
			if(i!=n-1){x=x-1;}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<m;++j)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}