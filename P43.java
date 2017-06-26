import java.io.*;
class P43
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		int n=Integer.parseInt(k.readLine());
		System.out.println("1");
		int p=2,q=3,i,j,x;
		for(i=1;i<n;++i)
		{
			for(j=p;j<=q;++j)
			{
				System.out.print(j);
			}
			for(x=q-1;x>=p;--x)
			{
				System.out.print(x);
			}
			p++;q+=2;
			System.out.println("");
		}
	}
}