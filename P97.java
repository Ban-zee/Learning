import java.io.*;
class P97
{
	int check(int n)
	{
		int i,m=0;
		for(i=1;i<=n;++i)
		{
			if(n%i==0){++m;}
		}
		return m;
	}
	void input()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		int p=n,r,s=0;
		while(p!=0)
		{
			r=p%10;
			s=s*10+r;
			p=p/10;
		}
		if(check(n)==2&&check(s)==2)
		{
			System.out.println("Emirp Number");
		}
		else
		{
			System.out.println("Not an Emirp Number");
		}
	}
	public static void main(String[]args)throws IOException
	{
		P97 r=new P97();
		r.input();
	}
}