import java.io.*;
class P39
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the range");
		int n=Integer.parseInt(k.readLine());
		char ch='a';
		String A="";
		A=A+ch;
		int i,j,x=n-1,c;
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=x;++j)
			{
				System.out.print(" ");
			}
			x--;
			for(c=0;c<i;++c)
			{
				System.out.print(A.charAt(c));
			}
			A=A+(char)(ch+1);
			System.out.print(ch);
			System.out.println("");
		}
	}
}