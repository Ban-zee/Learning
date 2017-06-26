import java.io.*;
class P119
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		if(n*n%((int)Math.pow(10,((int)Math.log10(n))+1))==n)
		{
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("Not an Automorphic number");
		}
	}
}