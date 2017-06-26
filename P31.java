import java.io.*;
class Numbers
{
	int hcf(int a,int b)
	{
		int h;
		do
		{
			h=b%a;
			b=a;
			a=h;
		}
		while(h!=0);
		return b;
	}
	int lcm(int m,int n)
	{
		int l;
		l=(m*n)/hcf(m,n);
		return l;
	}
	void cal(int x,int y)
	{
		System.out.println(hcf(x,y));
		System.out.println(lcm(x,y));
	}
}
class P31
{
	public static void main(String[]args)throws IOException
	{
		Numbers ob=new Numbers();
		ob.cal(100,73);
	}
}