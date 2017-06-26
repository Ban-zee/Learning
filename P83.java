import java.io.*;
class P83
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Sentence");
		String S=k.readLine();
		String A[]=S.split(" ");
		String M="";
		int n=A.length;
		int i,j;
		for(i=1;i<n;++i)
		{
			for(j=0;j<n-i;++j)
			{
				if(A[j].compareTo(A[j+1])>0)
				{
					M=A[j];
					A[j]=A[j+1];
					A[j+1]=M;
				}
			}
		}
		for(i=0;i<n;++i)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		System.out.println("Length= "+n);
	}
}