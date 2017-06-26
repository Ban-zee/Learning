import java.io.*;
class hcf
{
	private int dd,dv,m;
	public void acceptData()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the dividend&&divisor");
		dd=Integer.parseInt(k.readLine());
		dv=Integer.parseInt(k.readLine());
	}
	public void hcf(hcf a[],int n)
	{
		int i,r;
		for(i=0;i<n;++i)
		{
			do
			{
				r=a[i].dd%a[i].dv;
				a[i].dd=a[i].dv;
				a[i].dv=r;
			}
			while(r!=0);
			a[i].m=a[i].dd;
		}
		display(a,n);
	}
	private void display(hcf a[],int n)
	{
		int i;
		for(i=0;i<n;++i)
		{
			System.out.println("Hcf=:"+"\t"+a[i].m);
		}
	}
}
class P104
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		hcf r=new hcf();
		int n,i;
		System.out.println("Enter the number of records");
		n=Integer.parseInt(k.readLine());
		hcf a[]=new hcf[n];
		for(i=0;i<n;++i)
		{
			a[i]=new hcf();
			a[i].acceptData();
		}
		r.hcf(a,n);
	}
}