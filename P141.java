import java.io.*;
class P141
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range:");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=0,x;
		for(i=1;i<=n;++i)
		{
			if(i%2==0)
			{
				x=m+i;
				m=x;
				for(j=1;j<=i;++j)
				{
					System.out.print(x+"\t");
					x=x-1;
				}
				System.out.println("");
			}
			else
			{
				for(j=1;j<=i;++j)
				{
					m=m+1;
					System.out.print((m)+"\t");
				}
					System.out.println("");
				}
			}
		}
	}
