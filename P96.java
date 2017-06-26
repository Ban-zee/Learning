import java.io.*;
class P96
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String S=k.readLine();
		int i,n,m=0,x,j;
		n=S.length();
		x=(n-1)/2;
		char M[][]=new char[n][n];
		for(i=0;i<n;++i)
		{
			m=0;
			for(j=0;j<n;++j)
			{
				M[i][j]=S.charAt(m);
				m++;
			}
		}
		m=0;
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(i==x||i==j||(i+j)==n-1||j==x)
				{
					System.out.print(M[i][j]+"\t");
				}
				else
				{
					System.out.print(" "+"\t");
				}
			}
			System.out.println("");
		}
	}
}