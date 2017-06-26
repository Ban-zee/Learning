import java.io.*;
class P145
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		int i,m=0;
		for(i=1;i<=n;++i)
		{
			if(i*(i+1)==n){m=1;}
		}
		if(m==1)
		{
			System.out.println("Aniruddha's number");
		}
		else
		{
			System.out.println("Not Aniruddha's number");
		}
	}
}