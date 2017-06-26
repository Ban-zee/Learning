import java.io.*;
import java.util.*;
class P4
{
	public static void main(String[]args)throws IOException
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter a word");
		String S=r.nextLine();
		int i,n;
		String A="";
		n=S.length();
		for(i=0;i<n;++i)
		{
			if(i<n-1&&S.charAt(i)=='c'&&S.charAt(i+1)=='a'&&S.charAt(i+2)=='t')
			{
				A=A+"catdog";
				i=i+3;
			}
			else
			{
				A=A+S.charAt(i);
			}
		}
		System.out.println(A);
	}
}