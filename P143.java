import java.io.*;
class P143
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m,x,c,v=0;
		m=((n)*(n+1))/2;
		x=m;
		for(i=1;i<=n;++i)
		{
			m=x-1;
			if(i%2!=0)
			{
				for(j=n-i;j>=0;--j)
				{
					System.out.print(m+"\t");
					m--;
				}
				System.out.println("");
				v=m;
			}

			else
			{
				x=v-(n-i);
				c=x;
				for(j=n-i;j>=0;--j)
				{
					System.out.print(c+"\t");
					c++;
				}
				System.out.println("");
			}
		}
	}
}

