import java.io.*;
class P142
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Buffer will act as a temporary memory location till you dont press enter");
		System.out.println("Let me show you how");
		int n=Integer.parseInt(k.readLine());
		int i;
		for(i=1;i<=n;++i)
		{
			char ch=(char)k.read();
		}
	}
}