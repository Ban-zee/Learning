import java.io.*;
class P15
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the range");
		int r=Integer.parseInt(k.readLine());
		int a=-1,b=1,c;
		int i;
		for(i=1;i<=r;++i)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
		}
	}
}