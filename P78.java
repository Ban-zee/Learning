import java.io.*;
class P78
{
	int length(int n)
	{
		int x=n,d=0;
		while(x!=0)
		{
			x=x/10;
			d++;
		}
		return d;
	}
	double power(int n,int i)
	{
		return Math.pow(n,i);
	}
	void accept()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		int i=length(n);
		int x=n,r;
		double s=0;
		while(x>0)
		{
			r=x%10;
			s=s+power(r,i);
			i--;
			x=x/10;
		}
		if(s==n)
		{
			System.out.println("Disarium Number");
		}
		else
		{
			System.out.println("Not a Disarium Number");
		}
	}
	public static void main(String[]args)throws IOException
	{
		P78 r=new P78();
		r.accept();
	}
}