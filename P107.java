import java.io.*;
class Emirp
{
	int n,m,f;
	Emirp(int nn)
	{
		n=nn;
		m=0;
		f=2;
	}
	int isprime(int x)
	{
		int i,c=0;
		for(i=1;i<=x;++i)
		{
			if(x%i==0)c++;
		}
		return c;
	}
	void isEmirp()
	{
		int i,p,r,s=0;
		p=n;
		while(p!=0)
		{
			r=p%10;
			s=s*10+r;
			p=p/10;
		}
		if(isprime(n)==2&&isprime(s)==2)
		{
			System.out.println("Primes");
		}
	}
}
class P107
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		Emirp r=new Emirp(n);
		r.isEmirp();
	}
}

