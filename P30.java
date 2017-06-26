import java.io.*;
class twin
{
	int factor(int n)
	{
		int i,c=0;
		for(i=1;i<=n;++i)
		{
			if(n%i==0){c++;}
		}
		return c;
	}
	void cal(int m,int n)
	{
		int j;
		for(j=m;j<=n-2;++j)
		{
			if(factor(j)==2&&factor(j+2)==2)
			{
				System.out.println(j+" "+(j+2));
			}
		}
	}
}
class P30
{
	public static void main(String[]args)throws IOException
	{
		twin ob=new twin();
		ob.cal(1,100);
	}
}