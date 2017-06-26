import java.io.*;
class P71
{
	String Sort(String M)
	{
		String X="";
		char i;
		int j,n;
		n=M.length();
		for(i='A';i<='z';++i)
		{
			for(j=0;j<n;++j)
			{
				if(M.charAt(j)==i){X=X+M.charAt(j);}
			}
		}
		return X;
	}
	void input()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the text");
		String S=k.readLine();S=S+".";
		String A="",B="";
		int x,l;
		l=S.length();
		for(x=0;x<l;++x)
		{
			if(S.charAt(x)!=' '&&S.charAt(x)!='.'){A=A+S.charAt(x);}
			else
			{
				B=B+" "+Sort(A)+" ";
				A="";
			}
		}
		System.out.println(B);
	}
	public static void main(String[]args)throws IOException
	{
		P71 r=new P71();
		r.input();
	}
}