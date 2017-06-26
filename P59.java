import java.io.*;
class P59
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int a[]={5,3,8,4,9,2,1,12,98,16};
		int i,j,t;
		for(i=1;i<a.length;++i)
		{
			for(j=0;j<a.length-i;++j)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<a.length;++i)
		{
			System.out.println(a[i]);
		}
	}
}