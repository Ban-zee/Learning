import java.io.*;
class P41
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a number");
		int n=Integer.parseInt(k.readLine());
		int p=n,r,c=1,s=0,x,j;
		do
		{
			r=p%2;
			s=s+c*r;
			c=c*10;
			p=p/2;
		}
		while(p!=0);
		System.out.println(s);
		x=s;s=0;
		c=0;
		while(x!=0)
		{
			j=x%10;
			s=s+(int)Math.pow(2,c)*j;
			x=x/10;
			c++;
		}
		System.out.println(s);
	}
}