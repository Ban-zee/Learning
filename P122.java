import java.io.*;
class P122
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n");
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int[n][n];
		int i,j,k,m=0;
		for(k=0;k<2*n;++k)
		{
			for(i=0;i<n;++i)
			{
				for(j=0;j<n;++j)
				{
					if(k%2==0)
					{
						if(i+j==k)a[j][i]=++m;
					}
					else if(k%2!=0)
					{
						if(i+j==k)a[i][j]=++m;
					}
				}
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(a[i][j]+"\t");
			}
			for(j=1;j<=2;++j)System.out.println("\t");
		}
	}
}