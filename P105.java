import java.io.*;
class Exchange
{
	String S,R;
	int size;
	Exchange()
	{
		S=R="";
		size=0;
	}
	void read()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence");
		S=k.readLine();
	}
	void exfirstlast()
	{
		size=S.length();
		int i;
		for(i=0;i<size;++i)
		{
			char ch=S.charAt(i);
		}
		char x=S.charAt(0);
		char y=S.charAt(size-1);
		for(i=0;i<size;++i)
		{
			if(i==0)
			{
				R=R+y;
			}
			else if(i==size-1)
			{
				R=R+x;
			}
			else
			{
				R=R+S.charAt(i);
			}
		}
	}
	void display()
	{
		System.out.println(R);
	}
}
class P105
{
	public static void main(String[]args)throws IOException
	{
		Exchange r=new Exchange();
		r.read();
		r.exfirstlast();
		r.display();
	}
}
