import java.io.*;
class P7
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a Sentence");
		String S=k.readLine();S=S+" ";
		int i,n,p=0;
		n=S.length();
		String A="",B="";
		for(i=0;i<n;++i)
		{
			if(S.charAt(i)!=' ')
			{
				A=A+S.charAt(i);
				B=S.charAt(i)+B;
			}
			else
			{
				if(A.equals(B))
				{
					p++;
				}
				A="";
				B="";
			}
		}
		System.out.println(p);
	}
}