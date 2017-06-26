import java.io.*;
class Encoder
{
	String wrd,mod;
	public void acceptWord()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the word");
		wrd=k.readLine();
		mod="";
	}
	private char convertCase(char c)
	{
		char ch=0;
		if(c>='A'&&c<='Z'){ch=(char)(c+32);}
		else if(c>='a'&&c<='z'){ch=(char)(c-32);}
		return ch;
	}
	private char nextCharacter(char c)
	{
		char ch;
		if(c=='z'){ch='a';}
		else if(c=='Z'){ch='A';}
		else{ch=(char)(c+1);}
		return ch;
	}
	public void encode()
	{
		int i;char ch;
		for(i=0;i<wrd.length();++i)
		{
			ch=wrd.charAt(i);
			mod=mod+nextCharacter((convertCase(ch)));
		}
	}
	public void display()
	{
		System.out.println(mod);
	}
}
class P115
{
	public static void main(String[]args)throws IOException
	{
		Encoder m=new Encoder();
		m.acceptWord();
		m.encode();
		m.display();
	}
}