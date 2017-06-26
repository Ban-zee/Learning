import java.io.*;
import java.util.*;
class MergeArray
{
int a[],n;
MergeArray()
{
	Scanner k=new Scanner(System.in);
	System.out.println("Enter the size//method");
	n=k.nextInt();
	a=new int[n];
	int i;
	System.out.println("Enter the value//method");
	for(i=0;i<n;++i)
	{
		a[i]=k.nextInt();
	}
}
MergeArray(int arr[],int m)
{
	n=m;
	a=new int[m];
	int i;
	for(i=0;i<n;++i)
	{
		a[i]=arr[i];
	}
}
public MergeArray merge(MergeArray d)
{
	MergeArray m=new MergeArray();
	m.n=n+d.n;
	m.a=new int[m.n];
	int i,x;
	for(i=0;i<n;++i)
	{
		m.a[i]=a[i];
	}
	x=i;
	for(i=0;i<d.n;++i)
	{
		m.a[x]=d.a[i];
		x++;
	}
	m.n=x;
	return m;
}
public void display()
{
	int i;
	System.out.println("The merged array is");
	for(i=0;i<n;++i)
	{
		System.out.println(a[i]);
	}
}
}
class P102
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size//main");
		int n=Integer.parseInt(k.readLine());
		int a[]=new int[n];
		int i;
		System.out.println("Enter the values//main");
		for(i=0;i<n;++i)
		{
			a[i]=Integer.parseInt(k.readLine());
		}
		MergeArray p1=new MergeArray();
		MergeArray p2=new MergeArray(a,n);
		p1=p1.merge(p2);
		p1.display();
	}
}