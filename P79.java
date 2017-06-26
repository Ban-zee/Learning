import java.io.*;
class P79
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String A="a",B="b",C="";
		System.out.println("Enter the range");
		int n=Integer.parseInt(k.readLine());
		int i;
		if(n==1)
		{
			System.out.println(A);
		}
		else if(n==2)
		{
			System.out.println(A+" "+B);
		}
		else if(n>2)
		{
			System.out.print(A+" "+B);
			for(i=1;i<=n-2;++i)
			{
				C=B+A;
				A=B;
				B=C;
				System.out.print(" "+C+" ");
			}
		}
	}
}