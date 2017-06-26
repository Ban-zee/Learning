import java.io.*;
class P51
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		int n=Integer.parseInt(k.readLine());
		int i,j,m=n-1,x,y;
		for(i=1;i<n;++i)
		{
			for(y=1;y<i;++y)
			{
				System.out.print(" ");
			}
			for(j=1;j<=1;++j)
			{
				System.out.print("*");
			}
			for(x=1;x<=m;++x)
			{
				System.out.print(" ");
			}
			for(x=1;x<=m;++x)
			{
				System.out.print(" ");
			}
			if(i<n)
			{for(y=1;y<=1;++y)
			{
				System.out.print("*");
			}}
			m--;
			System.out.println("");
		}
		m=1;
		for(i=n;i>=1;--i)
		{
			for(y=1;y<i;++y)
			{
				System.out.print(" ");
			}
			for(j=1;j<=1;++j)
			{
				System.out.print("*");
			}
			for(x=1;x<m-1;++x)
			{
				System.out.print(" ");
			}
			for(x=1;x<m;++x)
			{
				System.out.print(" ");
			}
			if(i<n){
			for(y=1;y<=1;++y)
			{
				System.out.print("*");
			}}
			m++;
			System.out.println("");
		}
	}
}