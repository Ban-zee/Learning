import java.io.*;
class P90
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[n][n];
		int i,j,r=0,c=-1,m=0,x=n;
		while(n>=1)
		{
			   for(i=1;i<=n;++i)a[r][++c]=++m;
			   for(i=1;i<=n-1;++i)a[++r][c]=++m;
			   for(i=1;i<=n-1;++i)a[r][--c]=++m;
			   for(i=1;i<=n-2;++i)a[--r][c]=++m;
			   n=n-2;
		 }
		 for(i=0;i<x;++i)
		 {
			 for(j=0;j<x;++j)
			 {
				 System.out.print(a[i][j]+"\t");
			 }
			 System.out.println("");
		 }
	 }
 }