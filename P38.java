import java.io.*;
class P38
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int n=Integer.parseInt(k.readLine());
		int a=-1,b=1,c,f=0,m=0;
		do
		{
			c=a+b;
			a=b;
			b=c;
			m++;
			if(c==n){f=1;break;}
		}
		while(c<n);
		if(f==1)
		{
			System.out.println("It is the "+m+"th term of fibonacci series");
		}
		else
		{
			System.out.println("The term is not in fibonacci series");
		}
	}
}