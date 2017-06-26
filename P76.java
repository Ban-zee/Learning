import java.io.*;
class P76
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
	int magic(int n)
	{
		int i,m=n,s=0,r,x=0;
		do
		{
			while(m!=0)
				{
					r=m%10;
					s=s+r;
					m=m/10;
				}
				m=s;
				s=0;
		}
		while(m>10);
		return m;
	}
	void logic()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter m&n");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int i,f=0;
		if(m<=n)
		{
			for(i=m;i<=n;++i)
			{
				if((check(i)>2)&&(magic(i)==10||magic(i)==1))
				{
					System.out.print(i+" ");
					f++;
				}
			}
			System.out.println("Frequency= "+f);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
	public static void main(String[]args)throws IOException
	{
		P76 r=new P76();
		r.logic();
	}
}