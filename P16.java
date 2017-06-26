import java.io.*;
class P16
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the number");
		int n=Integer.parseInt(k.readLine());
		int p=n,d=0,q,r,w=0;
		boolean f=false;
		while(p!=0)
		{
			p=p/10;
			d++;
		}
		if(d%2!=0){f=true;}
		else
		{
			d=d/2;
			d=(int)Math.pow(10,d);
			q=n/d;
			r=n%d;
			w=q+r;
		}
		if(w*w==n&&f==false)
		{
			System.out.println("Antique Number");
		}
		else
		{
			System.out.println("Not an Antique Number");
		}
	}
}