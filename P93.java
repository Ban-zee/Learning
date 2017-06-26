import java.io.*;
class P93
{
	String Sort(String S)
	{
		char i;int j;
		String A="";
		char t;
		for(i='A';i<='z';++i)
		{
			for(j=0;j<S.length();++j)
			{
				if(i==S.charAt(j)){A=A+S.charAt(j);}
			}
		}
		return A;
	}
	void logic()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence");
		String S=k.readLine();String A="",W="";
		int i;
		S=S+".";
		for(i=0;i<S.length();++i)
		{
			if(S.charAt(i)!=' '&&S.charAt(i)!='.'){A=A+S.charAt(i);}
			else
			{
				W=W+" "+Sort(A)+" ";
				A="";
			}
		}
		System.out.println(W);
	}
	public static void main(String[]args)throws IOException
	{
		P93 r=new P93();
		r.logic();
	}
}