import java.io.*;
class P11
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a word");
		String S=k.readLine();
		String A="";
		int i,n;
		n=S.length();
		for(i=0;i<n;++i)
		{
			A=A+" ";
			System.out.println(A+S.charAt(i));
		}
	}
}