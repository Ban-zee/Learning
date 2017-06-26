import java.io.*;
class P148
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of your army:");
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
		System.out.println("The appropriate battle plan is:");
		for(i=0;i<n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(i==j||(i+j)==n)
				{
					System.out.print(a[i][j]+"\t");
				}
				else
				{
					System.out.print("_");
				}
			}
			System.out.println("");
		}
	}
}