import java.io.*;
class P14
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the number");
		int n=Integer.parseInt(k.readLine());
		int i=n,f,j,r,s=0;
		while(n!=0)
		{
			f=1;
			r=n%10;
			for(j=1;j<=r;++j)
			{
				f=f*j;
			}
			s=s+f;
			n=n/10;
		}
		if(s==i)
		{
			System.out.println("Krishnamurthy Number");
		}
		else
		{
			System.out.println("Jaykant Number");
		}
	}
}