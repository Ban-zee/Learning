import java.io.*;
import java.util.Scanner;
class P1
{
	public static void main(String[]args)throws IOException
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter your name");
		String S=r.nextLine();
		int i,n;
		String B="";
		n=S.length();
		String A=S.substring(S.lastIndexOf(' '),n);
		S=" "+S;
		for(i=0;i<S.lastIndexOf(' ');++i)
		{
			if(S.charAt(i)==' ')
			{
				B=B+S.charAt(i+1)+".";
			}
		}
		System.out.println(B+A);
	}
}