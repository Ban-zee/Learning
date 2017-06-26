import java.io.*;
class P20
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[10];
		int i,j,t;
		for(i=0;i<10;++i)
		{
			System.out.println("Value");
			a[i]=Integer.parseInt(k.readLine());
		}
		for(i=0;i<9;++i)
		{
			for(j=i+1;j<10;++j)
			{
				if(a[j]<a[i])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("The array[] in ascending order is:");
		for(i=0;i<10;++i)
		{
			System.out.println(a[i]);
		}
	}
}