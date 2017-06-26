import java.io.*;
class P91
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size for first matrix");
		int p=Integer.parseInt(k.readLine());
		int q=Integer.parseInt(k.readLine());
		System.out.println("Enter the size of second matrix");
		int r=Integer.parseInt(k.readLine());
		int s=Integer.parseInt(k.readLine());
		int a[][]=new int[p][q];
		int b[][]=new int[r][s];
		int m[][]=new int[p][s];
		int i,j,c,u,v,x;
		System.out.println("Enter  the values for the first matrix:");
		for(i=0;i<p;++i)
		{
			for(j=0;j<q;++j)
			{
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		System.out.println("Enter the values for the second matrix:");
		for(i=0;i<r;++i)
		{
			for(j=0;j<s;++j)
			{
				b[i][j]=Integer.parseInt(k.readLine());
			}
		}
		if(q==r)
		{
			for(i=0;i<p;++i)
			{
				c=0;x=1;
				for(j=0;j<s;++j)
				{
					u=a[i][c]*b[c][j];
					v=a[i][x]*b[x][j];
					m[i][j]=u+v;
				}
			}
			for(i=0;i<p;++i)
			{
				for(j=0;j<s;++j)
				{
					System.out.print(m[i][j]+"\t");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Multiplication not possible");
		}
	}
}