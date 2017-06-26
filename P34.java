import java.io.*;
class Mensuration
{
	void area(int l,int b)
	{
		System.out.println(l*b);
	}
	void area(double s)
	{
		System.out.println(s*s);
	}
	void area(float b)
	{
		System.out.println(b*b*3.14);
	}
}
class P34
{
	public static void main(String[]args)throws IOException
	{
		Mensuration ob=new Mensuration();
		ob.area(20,30);
		ob.area(43);
		ob.area(203);
	}
}