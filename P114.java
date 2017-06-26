import java.io.*;
class Sum
{
	private double factorial(int p)
	{
		int i,m=1;
		for(i=1;i<=p;++i)
		{
			m=m*i;
		}
		return m;
	}
	private double power(int b,int e)
	{
		return (int)Math.pow(b,e);
	}
	private double sumSeries(int x,int n)
	{
		int i=2,j,c=0,m=1;
		double s=0;
		while(i<=n)
		{
			c=0;
			for(j=1;j<=i;++j)
			{
				if(i%j==0){c++;}
			}
			if(c==2)
			{
				s=s+power(x,i)/factorial(i);
				m++;i++;
			}
			else{++i;}
		}
		return s;
	}
	public void display(int x,int n)
	{
		System.out.println(sumSeries(x,n));
	}
}
class P114
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of x,n");
		int x=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		Sum r=new Sum();
		r.display(x,n);
	}
}