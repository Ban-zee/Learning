import java.io.*;
class P152
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int n=Integer.parseInt(k.readLine());
		char a[][]=new char[n][n];
		int i,j;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]='*';
			}
		}
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(i==j|(j-i)==1||(i-j)==1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
