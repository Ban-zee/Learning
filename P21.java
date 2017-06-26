import java.io.*;
class P21
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String a[]=new String[10];
		int i,j;
		String t="";
		for(i=0;i<10;++i)
		{
			System.out.println("Name");
			a[i]=k.readLine();
		}
		for(i=1;i<10;++i)
		{
			for(j=0;j<10-i;++j)
			{
				if(a[j].compareTo(a[j+1])<0)
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("The array[] in sorted order is");
		for(i=0;i<10;++i)
		{
			System.out.println(a[i]);
		}
	}
}