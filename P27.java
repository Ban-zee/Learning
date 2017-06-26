import java.io.*;
class P27
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a number");
		int n=Integer.parseInt(k.readLine());
		int r,s=0;
		while(n!=0)
		{
			r=n%8;
			s=s*10+r;
			n=n/8;
		}
		System.out.println(s);
	}
}