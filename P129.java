import java.io.*;
class P129
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String S=k.readLine();
		char a[]=S.toCharArray();
		int i,x,j,c=0;
		char t;
		x=a.length;
		char m[]=new char[x];
		int d[]=new int[x];
		for(i=0;i<x;++i)
		{
			if(a[i]>='A'&&a[i]<='z')
			{
				m[c]=a[i];
				d[c]=i;
				c++;
			}
		}
		for(i=1;i<c;++i)
		{
			for(j=0;j<c-i;++j)
			{
				if(m[j]>m[j+1])
				{
					t=m[j];
					m[j]=m[j+1];
					m[j+1]=t;
				}
			}
		}
		c=0;
		for(i=0;i<x;++i)
		{
			if(i==d[c])
			{
				a[i]=m[c];
				c++;
			}
		}
		System.out.println("The Sorted Word is:");
		for(i=0;i<x;++i)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
	}
}
