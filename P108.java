import java.io.*;
import java.util.*;
class P108
{
	int term(int n)
	{
		return (n<=3)?1:term(n-1)+term(n-3);//11123457
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		P108 m=new P108();
		System.out.println("Enter the term you want:");
		int n=Integer.parseInt(k.readLine());
		System.out.println(m.term(n));
	}
}