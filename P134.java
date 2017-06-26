import java.io.*;
class P134
{
	static int trick(int n)
	{
		if(n>2)
		{
			System.out.println(n+"Wow");
			n=trick(n-1);
			System.out.println(n+"Hey");
			n=trick(n-1);
			System.out.println(n+"Alas");
		}
		System.out.println(n+"Ma");
		return n;
	}
	public static void main(String[]args)throws IOException
	{
		P134 r=new P134();
		r.trick(4);
	}
}