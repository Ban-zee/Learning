import java.io.*;
class Angle
{
	private int d,m,s;
	public void acceptAngle()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the angle");
		d=Integer.parseInt(k.readLine());
		m=Integer.parseInt(k.readLine());
		s=Integer.parseInt(k.readLine());
	}
	public void sumOfAngle(Angle Ang)
	{
		s=s+Ang.s;
		m=m+Ang.m;
		d=d+Ang.d;
		if(s>=60)
		{
			s=s-60;
			m++;
			if(m>=60)
			{
				m=m-60;
				d++;
			}
		}
		else if(m>=60)
		{
			m=m-60;
			d++;
		}
	}
	public void display()
	{
		System.out.println(d+"'"+m+"''"+s+"'''");
	}
}
class P99
{
	public static void main(String[]args)throws IOException
	{
		Angle p1=new Angle();
		Angle p2=new Angle();
		p1.acceptAngle();
		p2.acceptAngle();
		p1.sumOfAngle(p2);
		p1.display();
	}
}