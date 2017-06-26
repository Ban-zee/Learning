import java.io.*;
class P80
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amt");
		int n=Integer.parseInt(k.readLine());
		int a[]={1000,500,100,50,20,10,5,2,1};
		int i,f=0,t=0;
		for(i=0;i<9;++i)
		{
			f=n/a[i];
			if(f!=0)
			{
				System.out.println(a[i]+"\t"+f);
			}
			t=t+f;
			n=n%a[i];
		}
		System.out.println(t);
	}
}