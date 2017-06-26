import java.io.*;
class Constructors
{
	int m,n,q;
	Constructors(int a,int b,int t)
	{
		m=a;
		n=b;
		q=t;
	}
	int check(int x)
	{
		int i,c=0;
		for(i=1;i<=x;++i)
		{
			if(x%i==0){c++;}
		}
		if(c==2){return 1;}
		else {return 0;}
	}
	void check()
	{
		int g,h,c1;
		g=m-1;
		h=m+1;
		int j;
		for(j=1;j<=q;++j)
		{
			c1=g+h;
			g=h;
			h=c1;
			if(check(c1)==1)
			{
				System.out.println(c1);
			}
		}
	}
}
class P35
{
	public static void main(String[]args)throws IOException
	{
		Constructors ob=new Constructors(0,1,10);
		ob.check();
	}
}