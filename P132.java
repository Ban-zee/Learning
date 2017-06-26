import java.io.*;
class P132
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values of m&n");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[m][n];
		System.out.println("Enter the values:");
		int i,j,x,t;
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
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		for(i=0;i<m-1;++i)
		{
			for(j=0;j<n;++j)
			{
				for(x=0;x<m;++x)
				{
					if(a[i][x]>a[i+1][x])
					{
						t=a[i][x];
						a[i][x]=a[i+1][x];
						a[i+1][x]=t;
					}
				}
			}
		}
		System.out.println("The array sorted columnwise is:");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}

