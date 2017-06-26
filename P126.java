import java.io.*;
class P126
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values of m&n");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[m][n];
		int i,j,g1,g2,p1,p2,j1,j2,x=0,x1,t,c;
		System.out.println("Enter the data");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		g1=a[0][0];g2=a[0][1];
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				if(a[i][j]>g1){g1=a[i][j];p1=i;j1=j;}
			}
		}
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				if(a[i][j]>g2&&a[i][j]!=g1){g2=a[i][j];p2=i;j2=j;}
			}
		}
		System.out.println(g1+"\t"+g2);
	}
}