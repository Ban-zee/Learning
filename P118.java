import java.io.*;
import java.lang.*;
class P118
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		double m=Math.log10(n);
		System.out.println("The number of digits= "+((int)m+1));
	}
}