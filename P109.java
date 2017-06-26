import java.io.*;
class P109
{
int number(String S)
{
	int x=S.length();
	return(S.length()==1)?1:1+number(S.substring(0,--x));
}
public static void main(String[]args)throws IOException
{
	BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String S=k.readLine();
	P109 r=new P109();
	System.out.println(r.number(S));
}
}