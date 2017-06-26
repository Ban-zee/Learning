import java.io.*;
class P18
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the size of array");
		int s=Integer.parseInt(k.readLine());
		int a[]=new int[s];
		int i,j=s/2,x=s-1;
		for(i=0;i<s;++i)
		{
			System.out.println("Value");
			a[i]=Integer.parseInt(k.readLine());
		}
		for(i=0;i<j;++i)
		{
			a[i]=a[i]+a[x];
			a[x]=a[i]-a[x];
			a[i]=a[i]-a[x];
			x--;
		}
		System.out.println("The reversed array[] is:");
		for(i=0;i<s;++i)
		{
			System.out.println(a[i]);
		}
	}
}