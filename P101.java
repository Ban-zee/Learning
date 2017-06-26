import java.io.*;
class Set
{
private int n,a[];
public void readElements()throws IOException
{
	BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size");
	n=Integer.parseInt(k.readLine());
	a=new int[n];
	int i;
	System.out.println("Enter the values:");
	for(i=0;i<n;++i)
	{
		a[i]=Integer.parseInt(k.readLine());
	}
}
public Set Intersection(Set d)
{
	Set m=new Set();
	m.a=new int[n];
	int i,j,k=0;
	if(n<=d.n)
	{
		for(i=0;i<n;++i)
		{
			for(j=0;j<d.n;++j)
			{
				if(a[i]==d.a[j])
				{
					m.a[k]=a[i];
					k++;
					break;
				}
			}
		}
	}
	else if(n>d.n)
	{
		for(i=0;i<d.n;++i)
		{
			for(j=0;j<n;++j)
			{
				if(d.a[i]==a[j])
				{
					m.a[k]=d.a[i];
					k++;break;
				}
			}
		}
	}
	a=null;
	d.a=null;
	m.n=k;
	return m;
}
	public void display()
	{
		int i;
		for(i=0;i<n;++i)
		{
			System.out.println(a[i]);
		}
	}
}
class P101
{
	public static void main(String[]args)throws IOException
	{
		Set p1=new Set();
		Set p2=new Set();
		p1.readElements();
		p2.readElements();
		p2=p1.Intersection(p2);
		p2.display();
	}
}