import java.io.*;
class P17
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[5];
		int b[]=new int[3];
		int c[]=new int[8];
		int i,j=0;
		for(i=0;i<5;++i)
		{
			System.out.println("Value");
			a[i]=Integer.parseInt(k.readLine());
		}
		for(i=0;i<3;++i)
		{
			System.out.println("Value");
			b[i]=Integer.parseInt(k.readLine());
		}
		for(i=0;i<5;++i)
		{
			if(a[i]%2==0)
			{
				c[j]=a[i];
				j++;
			}
		}
		for(i=0;i<3;++i)
		{
			if(b[i]%2!=0)
			{
				c[j]=b[i];
				j++;
			}
		}
		for(i=0;i<j;++i)
		{
			System.out.println(c[i]);
		}
	}
}