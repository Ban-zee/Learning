import java.io.*;
class P70
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence");
		String S=k.readLine();String A="";S=S+" ";
		int i,n,j;
		String M="";
		n=S.length();
		for(i=0;i<n;++i)
		{
			if(S.charAt(i)!=' '){A=A+S.charAt(i);}
			else
			{
				if(i<n-1&&A.equals("is")){M=M+" are";}
				else if(i<n-1&&A.equals("he")){M=M+" they";}
				else{M=M+" "+A;}
				A="";
			}
		}
		System.out.println(M);
	}
}