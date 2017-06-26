import java.io.*;
class P66
{
	 static boolean f;
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String A[]=new String[5];
		double m[]=new double[5];
		int i,j,me=0,c=0;
		double t;String T;
		for(i=0;i<5;++i)
		{
			System.out.println("Name");
			A[i]=k.readLine();
			System.out.println("Marks");
			m[i]=Double.parseDouble(k.readLine());
		}
		for(i=1;i<5;++i)
		{
			for(j=0;j<5-i;++j)
			{
				if(m[j]<m[j+1])
				{
					t=m[j];
					m[j]=m[j+1];
					m[j+1]=t;
					T=A[j];
					A[j]=A[j+1];
					A[j+1]=T;
				}
			}
		}
		for(i=0;i<5;++i)
		{
			System.out.println(A[i]+"\t"+m[i]);
		}
		for(i=1;i<5;++i)
		{
			for(j=0;j<5-i;++j)
			{
				if(A[j].compareTo(A[j+1])>0)
				{
					T=A[j];
					A[j]=A[j+1];
					A[j+1]=T;
					t=m[j];
					m[j]=m[j+1];
					m[j+1]=t;
				}
			}
		}
	}
}