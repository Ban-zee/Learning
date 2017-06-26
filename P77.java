import java.io.*;
class P77
{
	void logic()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n");
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[n][n];
		int m[][]=new int[n][n];
		int i,j,c=0,x=0;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.println("Enter the value");
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				m[i][j]=a[j][i];
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(a[i][j]!=m[i][j]){c=1;}
				if(i==j||(i+j)==n-1){x=x+a[i][j];}
			}
		}
		if(c==0)
		{
			System.out.println("Symmetric Matrix");
		}
		else
		{
			System.out.println("Unsymmetric Matrix");
		}
		System.out.println(x);
	}
	public static void main(String[]args)throws IOException
	{
		P77 r=new P77();
		r.logic();
	}
}