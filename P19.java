import java.io.*;
class P19
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the size of the array");
		int s=Integer.parseInt(k.readLine());
		int a[]=new int[s];
		int i,t1,t2;
		for(i=0;i<s;++i)
		{
			System.out.println("Value");
			a[i]=Integer.parseInt(k.readLine());
		}
		t1=a[s-1];
		for(i=s-1;i>0;--i)
		{
			a[i]=a[i-1];
		}
		a[0]=t1;
		for(i=0;i<s;++i)
		{
			System.out.println(a[i]);
		}
	}
}