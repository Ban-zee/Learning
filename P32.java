import java.io.*;
class Sereis
{
	int fact(int y)
	{
		int f=1,i;
		for(i=1;i<=y;++i)
		{
			f=f*i;
		}
		return f;
	}
	int power(int m,int n)
	{
		int j,p=1;
		for(j=1;j<=n;++j)
		{
			p=p*m;
		}
		return p;
	}
	void cal(int x,int n)
	{
		int k,q=1,b=5;
		double s=0;
		for(k=1;k<=n;++k)
		{
			s=s+(power(x,q)/fact(b));
			q=q+2;
			b++;
		}
		System.out.println(s);
	}
}
class P32
{
	public static void main(String[]args)throws IOException
	{
		Sereis ob=new Sereis();
		ob.cal(3,5);
	}
}