import java.io.*;
class P72
{
	void input()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of rows and columns");
		int r=Integer.parseInt(k.readLine());
		int c=Integer.parseInt(k.readLine());
		int i,j,m=0;
		int a[][]=new int [r][c];
		for(i=0;i<r;++i)
		{
			for(j=0;j<c;++j)
			{
				System.out.println("Enter the number");
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		for(i=0;i<r;++i)
		{
			for(j=0;j<c;++j)
			{
				if((i+j)==r-1||i==j){m=m+a[i][j];}
			}
		}
		System.out.println(m);
	}
	public static void main(String[]args)throws IOException
	{
		P72 r=new P72();
		r.input();
	}
}