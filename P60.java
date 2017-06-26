import java.io.*;
class P60
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Sentence");
		String S=k.readLine();S=S+" ";String A="",L="";
		int n=S.length();
		int i;
		for(i=0;i<n;++i)
		{
			if(S.charAt(i)!=' '){A=A+S.charAt(i);}
			else
			{
				if(A.length()>L.length()){L=A;}
				A="";
			}
		}
		System.out.println(L+"\t"+L.length());
	}
}