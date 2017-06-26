import java.io.*;
class P110
{
	int  length(int n)
	{
		return(n==0)?0:1+length(n/10);
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		P110 r=new P110();
		System.out.println(r.length(n));
	}
}