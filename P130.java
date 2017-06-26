import java.io.*;
class P130
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sizes of both the arrays");
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		int a[]=new int[m];
		int b[]=new int[n];
		int c[]=new int[m+n];
		int i,j,x=0,h=0;
		System.out.println("Enter the data in first matrix");
		for(i=0;i<m;++i)
		{
			a[i]=Integer.parseInt(k.readLine());
		}
		System.out.println("Enter the data in second matrix");
		for(i=0;i<n;++i)
		{
			b[i]=Integer.parseInt(k.readLine());
		}
		for(i=0;i<m;++i)
		{
			c[i]=a[i];
		}
		x=i;
		for(j=0;j<n;++j)
		{
			c[x]=b[j];
			x++;
		}
		x=0;
		for(i=0;i<m+n;++i)
		{
			for(j=0;j<m+n;++j)
			{
				if(c[i]==c[j]){x++;h=j;}
			}
				if(x==2){c[h]=0;}
				x=0;
		}
		for(i=0;i<m+n;++i)
		{
			if(c[i]!=0)
			{
				System.out.println(c[i]);
			}
		}
	}
}