import java.io.*;
class P159
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[n][n];
		int i,j,m=(n-1)/2;
		for(i=0;i<n;++i)
		{
		for(j=0;j<n;++j)
		{
		a[i][j]=0;
		}
		}
		for(i=0;i<n;++i)
		{
		for(j=0;j<n;++j)
		{
		if((i+j)==m||(i-j)==m||i==m||j==m||(i+j)==m*3||(j-i)==m)
		{
		a[i][j]=1;
		}
		}
		}
		for(i=0;i<n;++i)
		{
		for(j=0;j<n;++j)
		{
		if(a[i][j]==1)
		{
		System.out.print(a[i][j]);
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println("");
		}
		}
}