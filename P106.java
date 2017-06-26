import java.io.*;
class  Sum
{
	int x,n;
	double sum;
	Sum(int xx,int nn)
	{
		x=xx;
		n=nn;
	}
	double findfact(int m)
	{
		int i;double f=1;
		for(i=1;i<=m;++i)
		{
			f=f*i;
		}
		return f;
	}
	double findpower(int x,int y)
	{
		return Math.pow(x,y);
	}
	void calculate()
	{
		int a=2;
		double s;
		int i;
		for(i=1;i<n;++i)
		{
			sum=sum+findpower(x,i)/findfact(i);
			a=a+2;
		}
	}
	void display()
	{
		System.out.println(sum);
	}
}
class P106
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter x&n");
		int x=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		Sum r=new Sum(x,n);
		r.calculate();
		r.display();
	}
}
