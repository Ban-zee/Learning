import java.io.*;
import java.util.*;
class P5
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word");
		String S=k.readLine();
		int i,n,j,m=1;
		n=S.length();
		for(i=n-1;i>=0;--i)
		{
			for(j=1;j<=m;++j)
			{
				System.out.print(S.charAt(i));
			}
			System.out.println("");
			m++;
		}
	}
}