import java.io.*;
class P136
{
	int rem(int a,int b,int c)
	{
		return(a<b*c)?((b*(c-1))-a)*-1:rem(a,b,c+1);
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers");
		int a=Integer.parseInt(k.readLine());
		int b=Integer.parseInt(k.readLine());
		P136 r=new P136();
		System.out.println(r.rem(a,b,1));
	}
}