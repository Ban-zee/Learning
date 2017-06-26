import java.io.*;
class P89
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		int i,j,s,x,m;
		for(i=1;i<=n;++i)
		{
			x=0;
			s=0;
			m=0;
			int a[]=new int[n];
			for(j=i;j<=n;++j)
			{
				s=s+j;
				a[m]=j;
				x++;m++;
				if(s>=n){break;}
			}
			if(s==n&&x!=1)
			{for(j=0;j<x;++j)
			{
				System.out.print(a[j]+"\t");
			}
			System.out.println("");
		}
		}
	}
}