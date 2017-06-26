import java.io.*;
class P25
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String A[]={"Angels&Demons","The Da Vinci Code","The Lost Symbol","The Inferno","Deception Point","The Digital Fortress"};
		System.out.println("Enter the name of the book");
		String S=k.readLine();
		int i,j,u=0,l=A.length-1,mid=0,c=0;
		String t="";
		for(i=1;i<A.length;++i)
		{
			for(j=0;j<A.length-i;++j)
			{
				if(A[j].compareToIgnoreCase(A[j+1])<0)
				{
					t=A[j];
					A[j]=A[j+1];
					A[j+1]=t;
				}
			}
		}
		while(u<=l)
		{
			mid=(u+l)/2;
			if(S.equalsIgnoreCase(A[mid])==true)
			{c=1;break;}
			else if(S.compareToIgnoreCase(A[mid])>0)
			{
				l=mid-1;
			}
			else
			{
				u=mid+1;
			}
		}
		if(c==1)
		{
			System.out.println("The author of the book is Dan Brown");
		}
		else
		{
			System.out.println("The author of the book is not Dan Brown");
		}
	}
}