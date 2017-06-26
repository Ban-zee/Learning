import java.io.*;
class P127
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values of m&n");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int a[][]=new int[m][n];
		int i,j,c,d,t;
		System.out.println("Enter the data");
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				a[i][j]=Integer.parseInt(k.readLine());
			}
		}
		for(i=0;i<m;++i)
		{
			int x[]=new int[n];
			for(j=0;j<n;++j)
			{
				x[j]=a[i][j];
			}
			for(c=1;c<n;++c)
			{
				for(d=0;d<n-c;++d)
				{
					if(x[d]>x[d+1])
					{
						t=x[d];
						x[d]=x[d+1];
						x[d+1]=t;
					}
				}
			}
			for(c=0;c<n;++c)
			{
				System.out.print(x[c]+"\t");
			}
			System.out.println("");
		}
	}
}