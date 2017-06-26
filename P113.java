import java.io.*;
class P113
{
	int arm(int n)
	{
		return(n==0)?0:(int)Math.pow(n%10,3)+arm(n/10);
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		P113 r=new P113();
		if(r.arm(n)==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
	}
}