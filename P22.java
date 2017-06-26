import java.io.*;
class P22
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
		for(i=1;i<10;++i)
		{
			for(j=0;j<10-i;++j)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
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