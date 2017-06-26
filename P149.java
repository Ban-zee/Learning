import java.io.*;
class P149
{
	int base(int n,int b)
	{
		int a,c;
		String S="";
		while(n!=0)
		{
			a=n/b;
			c=n%b;
			S=(c+"")+S;
			n=a;
		}
		return(Integer.parseInt(S));
	}
	void logic()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers");
		int a=Integer.parseInt(k.readLine());
		int b=Integer.parseInt(k.readLine());
		System.out.println(base(a,b));
	}
	public static void main(String[]args)throws IOException
	{
		P149 r=new P149();
		r.logic();
	}
}