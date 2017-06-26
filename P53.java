import java.io.*;
class P53
{
	 static int check(int x)
	{
		int i,c=0;
		for(i=1;i<=x;++i)
		{
			if(x%i==0){c++;}
		}
		return c;
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range");
		int r=Integer.parseInt(k.readLine());
		int a[]=new int[r];
		int j=1,n=1,q=0,v=r-1,l;
		while(j<=r)
		{
			if(check(n)==2)
			{
				a[q]=n;
				q++;
				n++;
				j++;
			}
			else
			{
				n++;
			}
		}
		for(j=0;j<r;++j)
		{
			for(n=1;n<=v;++n)
			{
				System.out.print(" ");
			}
			for(l=0;l<=j;++l)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println("");
			v--;
		}
	}
}