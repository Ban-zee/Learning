import java.io.*;
class P112
{
	String Reverse(String S)
	{
		return(S.length()==0)?"":Reverse(S.substring(1))+S.charAt(0);
	}
	public static void main(String[]args)throws IOException
	{
		P112 r=new P112();
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String S=k.readLine();
		System.out.println(r.Reverse(S));
	}
}