import java.io.*;
class P61
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int n=Integer.parseInt(k.readLine());
		int i,j;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print("1");
			}
			System.out.println("");
		}
	}
}