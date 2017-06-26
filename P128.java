import java.io.*;
class P128
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int a[]={31,29,31,30,31,30,31,31,30,31,30,31};
		String M[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","nov","dec"};
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		int m=0,i,c=0;
		for(i=0;i<12;++i)
		{
			m=m+a[i];
			if(m>n){c=i;break;}
		}
		m=m-a[c];
		System.out.println(n-m+"\t"+M[c]);
		System.out.println("Enter the date you want to know");
		int x=Integer.parseInt(k.readLine());
		m=0;
		if(n+x<=366)
		{
			n=n+x;
			for(i=0;i<12;++i)
			{
				m=m+a[i];
				if(m>n){c=i;break;}
			}
			System.out.println(c);
			m=m-a[c];
			System.out.println(n-m+"\t"+M[c]);
		}
		else
		{
			n=n+x-366;
			for(i=0;i<12;++i)
			{
				m=m+a[i];
				if(m>n){c=i;break;}
			}
			System.out.println(c);
			m=m-a[c];
			System.out.println(n-m+"\t"+M[c]);
		}
	}
}