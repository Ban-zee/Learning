import java.io.*;
class P46
{
	void compare(int x,int y)
	{
		int g;
		g=x>y?x:y;
		System.out.println(g);
	}
	void compare(char a,char b)
	{
		char i;
		i=(char)a>b?a:b;
		System.out.println(i);
	}
	void compare(String A,String B)
	{
		if(A.compareTo(B)>0)
		{
			System.out.println(A);
		}
		else
		{
			System.out.println(B);
		}
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Comparing 2 numbers");
		System.out.println("2.Comparing 2 characters");
		System.out.println("3.Comparing 2 Strings");
		System.out.println("Please enter your choice");
		int c=Integer.parseInt(k.readLine());
		P46 ob=new P46();
		switch(c)
		{
			case 1:
			System.out.println("Enter two numbers");
			int n1=Integer.parseInt(k.readLine());
			int n2=Integer.parseInt(k.readLine());
			ob.compare(n1,n2);
			break;
			case 2:
			System.out.println("Enter two characters");
			char c1=(char)k.read();
			char c2=(char)k.read();
			ob.compare(c1,c2);
			break;
			case 3:
			System.out.println("Enter the Strings");
			String S1=k.readLine();
			String S2=k.readLine();
			ob.compare(S1,S2);
			break;
			default:System.out.println("Wrong Choice");
		}
	}
}