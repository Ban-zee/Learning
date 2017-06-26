import java.io.*;
class Sorto
{
	private int code;
	private float salary;
	private String name;
	public void acceptData()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the serial no");
		code=Integer.parseInt(k.readLine());
		System.out.println("Enter the name");
		name=k.readLine();
		System.out.println("Enter the salary");
		salary=Float.parseFloat(k.readLine());
	}
	public void sortOnSalary(Sorto a[],int n)
	{
		int i,j;
		Sorto t;
		for(i=0;i<n-1;++i)
		{
			for(j=i+1;j<n;++j)
			{
				if(a[j].salary>a[i].salary)
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		display(a,n);
	}
	public void display(Sorto a[],int n)
	{
		int i;
		for(i=0;i<n;++i)
		{
			System.out.println(a[i].code+"\t"+a[i].name+"\t"+a[i].salary);
		}
	}
}
class P103
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		Sorto r=new Sorto();
		int i,n;
		System.out.println("Enter the no of records");
		n=Integer.parseInt(k.readLine());
		Sorto a[]=new Sorto[n];
		for(i=0;i<n;++i)
		{
			a[i]=new Sorto();
			a[i].acceptData();
		}
			r.sortOnSalary(a,n);
		}
	}