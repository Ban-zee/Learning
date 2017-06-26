import java.io.*;
class P8
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Range");
		int r=Integer.parseInt(k.readLine());
		int i,m=r-1,j,x,u,n=1,o=r,v,a,b=0,y;
		for(i=1;i<=r;++i)
		{
			for(j=1;j<=m;++j)
			{
				System.out.print(" ");
			}
			for(x=1;x<=i;++x)
			{
				System.out.print(x);
			}
			if(i!=1)
			{
				for(y=1;y<i;++y)
				{
					System.out.print(y);
				}
			}
			System.out.println("");
			m--;
}
}
}