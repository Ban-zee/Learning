import java.io.*;
class P121
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of children");
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[n][n];
		int i,j,m=0;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(i==j){a[i][j]=++m;}
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(i!=j){a[j][i]=++m;}
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(a[j][i]+"\t");
			}
			System.out.println("");
		}
		for(i=1;i<=3;++i)
		{
			System.out.println(" ");
		}
		System.out.println("Each column of array gives us the share of each son or daughter");
	}
}
