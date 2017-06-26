import java.io.*;
class Pallindrom
{
	int rev(int m)
	{
		int r,s=0;
		while(m!=0)
		{
			r=m%10;
			s=s*10+r;
			m=m/10;
		}
		return s;
	}
	void cal()throws IOException
	{
		int i;
		for(i=1;i<=100;++i)
		{
			if(rev(i)==i)
			{
				System.out.println(i);
			}
		}
	}
}
class P29
{
	public static void main(String[]args)throws IOException
	{
		Pallindrom ob=new Pallindrom();
		ob.cal();
	}
}