import java.io.*;
class P49
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int n=Integer.parseInt(k.readLine());
		int r,s=0;
		while(n!=0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		System.out.println(s);
	}
}