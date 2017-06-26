import java.io.*;
class P74
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		double n=Double.parseDouble(k.readLine());
		double i,x=0,m=1,y,u=n,j;
		for(i=1;i<=n;++i)
		{
			m=m+x;
			x++;
		}
		x--;y=m;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=u;++j)
			{
				System.out.print(((int)m++)+" ");
			}
			y=y-x;m=y;
			x--;u--;
			System.out.println("");
		}
	}
}