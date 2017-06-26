import java.io.*;
class P57
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Sentence");
		String S=k.readLine();S=S+" ";String A="";
		int i,n,m=0;
		n=S.length();
		System.out.println("Enter the word");
		String W=k.readLine();
		for(i=0;i<n;++i)
		{
			if(S.charAt(i)!=' '){A=A+S.charAt(i);}
			else
			{
				if(A.equalsIgnoreCase(W)){m++;}
				A="";
			}
		}
		System.out.println(m);
	}
}