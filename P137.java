import java.io.*;
class P137
{
	static boolean check(int n)
	{
		int p=n;
		int x[]=new int[(n+" ").length()];
		int i,c=0,m=0,j;
		while(p!=0)
		{
			x[c]=p%10;
			p=p/10;
			c++;
		}
		for(i=0;i<x.length;++i)
		{
			for(j=0;j<x.length;++j)
			{
				if(x[i]==x[j])m++;
			}
		}
		return(m==x.length);
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int i;
		P137 r=new P137();
		for(i=100000000;i<=999999999;++i)
		{
			if(i%9==0&&(i/10)%8==0&&(i/100)%7==0&&(i/1000)%6==0&&(i/10000)%5==0&&(i/100000)%4==0&&(i/1000000)%3==0&&(i/10000000)%2==0&&r.check(i)==true)
			{
				System.out.println(i);
			}
		}
	}
}
