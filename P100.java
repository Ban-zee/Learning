import java.io.*;
class Times
{
	private int d,m,s;
	public void acceptTime()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the time in 24-hr format");
		d=Integer.parseInt(k.readLine());
		m=Integer.parseInt(k.readLine());
		s=Integer.parseInt(k.readLine());
	}
	public void timeDifference(Times t)
	{
		if(t.s>s)
		{
			s=s+t.s;
		}
		else
		{
			s=s-t.s;
		}
		if(t.m>m)
		{
			m=(t.m)-m-1;
		}
		else
		{
			m=m-t.m;
		}
		if(t.d>d)
		{
			d=t.d-d-1;
		}
		else
		{
			d=d-t.d-1;
		}
	}
	public void display()
	{
		System.out.println(d+" hours "+m+" minutes "+s+" seconds ");
	}
}
class P100
{
	public static void main(String[]args)throws IOException
	{
		Times p1=new Times();
		Times p2=new Times();
		p1.acceptTime();
		p2.acceptTime();
		p2.timeDifference(p1);
		p2.display();
	}
}