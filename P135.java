import java.io.*;
class P135
{
	static int dg(int a,int b,int c)
	{
		return(a-(b*c)<0)?(c-1):dg(a,b,c+1);
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers");
		int a=Integer.parseInt(k.readLine());
		int b=Integer.parseInt(k.readLine());
		P135 r=new P135();
		System.out.println(r.dg(a,b,1));
	}
}