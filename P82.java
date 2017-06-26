import java.io.*;
class P82
{
	int check(int n)
	{
		int i,m=0;
		for(i=1;i<=n;++i)
		{
			if(n%i==0){m++;}
		}
		return m;
	}
	int pallindrom(int n)
	{
		int x=n,r,s=0;
		while(x!=0)
		{
			r=x%10;
			s=s*10+r;
			x=x/10;
		}
		return s;
	}
	void accept()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int i,t=0;
		for(i=m;i<=n;++i)
		{
			if(check(i)==2&&pallindrom(i)==i)
			{
				System.out.print(i+"     ");
				t++;
			}
		}
		System.out.println("Frequency= "+t);
	}
	public static void main(String[]args)throws IOException
	{
		P82 r=new P82();
		r.accept();
	}
}