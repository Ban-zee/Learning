import java.io.*;
class P24
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int a[]={2,3,5,43,342,0,43};
		int i,j,t,u=0,l=a.length-1,mid=0,val,c=0;
		System.out.println("Enter the value to be searched");
		val=Integer.parseInt(k.readLine());
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
		while(u<=l)
		{
			mid=(u+l)/2;
			if(val==mid){c=1;break;}
			else if(val<mid){l=mid-1;}
			else{u=mid+1;}
		}
		if(c==1)
		{
			System.out.println("The element to be searched is present");
		}
		else
		{
			System.out.println("The element you were looking for is absent");
		}
	}
}