import java.io.*;
class P92
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String S=k.readLine();
		int n=S.length();
		char M[][]=new char[2*n-1][2*n-1];
		int i,j,a,r=0,c=-1;
		a=2*n-1;
		char ch;
		for(i=0;i<n;++i)
		{
			ch=S.charAt(i);
			for(j=1;j<=a;++j)M[r][++c]=ch;
			for(j=1;j<=a-1;++j)M[++r][c]=ch;
			for(j=1;j<=a-1;++j)M[r][--c]=ch;
			for(j=1;j<=a-2;++j)M[--r][c]=ch;
			a=a-2;
			if(a<1){break;}
		}
		for(i=0;i<2*n-1;++i)
		{
			for(j=0;j<2*n-1;++j)
			{
				System.out.print(M[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}