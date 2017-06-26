import java.io.*;
class P13
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence");
		String S=k.readLine();S=S+" ";
		int i,n;
		String A="";
		n=S.length();
		for(i=0;i<n;++i)
		{
			if(S.charAt(i)!= ' ')
			{
				A=A+S.charAt(i);
			}
			else
			{
				System.out.println(A);
				A="";
			}
		}
	}
}