import java.io.*;
class P73
{
	int check(int n,int d)
	{
		int i,m=0;
		while(n>0)
		{
			if(n%10==d){++m;}
			n=n/10;
		}
		return m;
	}
	void check()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		int x=n,r,c;
		boolean f=false;
		while(x!=0)
		{
			r=x%10;
			c=check(n,r);
			if(c!=1){f=true;}
			x=x/10;
		}
		if(f==false)
		{
			System.out.println("Unique Number");
		}
		else
		{
			System.out.println("Not a Unique Number");
		}
	}
	public static void main(String[]args)throws IOException
	{
		P73 r=new P73();
		r.check();
	}
}