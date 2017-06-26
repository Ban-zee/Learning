import java.io.*;
class P10
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int r=Integer.parseInt(k.readLine());
		int i,j=0,x;
		for(i=1;i<=r;++i)
		{
			for(x=1;x<=i;++x)
			{
				System.out.print(++j);
			}
			System.out.println("");
		}
	}
}