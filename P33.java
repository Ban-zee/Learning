import java.io.*;
class Magical
{
	int sum(int n)
	{
		int r,s=0;
		while(n!=0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		return s;
	}
	int check(int m)
	{
		do
		{
			m=sum(m);
		}
		while(m>9);
		if(m==1){return 1;}
		else {return 0;}
	}
	void demo()
	{
		int i;
		for(i=100;i<=999;++i)
		{
			if(check(i)==1)
			{
				System.out.println(i);
			}
		}
	}
}
class P33
{
	public static void main(String[]args)throws IOException
	{
		Magical ob=new Magical();
		ob.demo();
	}
}