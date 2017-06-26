import java.io.*;
class P56
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String A[]={"Delhi","Bombay","Agra","Varanasi","Kolkata"};
		int i,j;
		String t="";
		for(i=1;i<A.length;++i)
		{
			for(j=0;j<A.length-i;++j)
			{
				if(A[j].compareTo(A[j+1])>0)
				{
					t=A[j];
					A[j]=A[j+1];
					A[j+1]=t;
				}
			}
		}
		for(i=0;i<A.length;++i)
		{
			System.out.println(A[i]);
		}
	}
}