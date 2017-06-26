import java.io.*;
class P111
{
	int lcm(int a,int b,int c)
	{
		int m,n;
		m=a>b?a:b;
		n=a>b?b:a;
		return(m*c%n==0)?m*c:lcm(m,n,++c);
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers");
		int a=Integer.parseInt(k.readLine());
		int b=Integer.parseInt(k.readLine());
		P111 r=new P111();
		System.out.println(r.lcm(a,b,1));
	}
}