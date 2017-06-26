import java.io.*;
class TheString
{
	String str;
	int len,wordcount,cons;
	TheString()
	{
		str="";
		len=wordcount=cons=0;
	}
	TheString(String ds)
	{
		str=ds;
	}
	void countFreq()
	{
		int x=str.length();
		int i;char m;
		for(i=0;i<x;++i)
		{
			m=str.charAt(i);
			if(m==' '){wordcount++;}
			if(m!='a'&&m!='e'&&m!='i'&&m!='o'&&m!='u'&&m!=' '&&m!='.'){cons=cons+1;}
		}
	}
	void display()
	{
		System.out.println(str+"\t"+(wordcount+1)+"\t"+cons);
	}
}
class P140
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		TheString x=new TheString();
	    System.out.println("Enter the String");
	    String M=k.readLine();
	    TheString r=new TheString(M);
	    r.countFreq();
	    r.display();
	}
}