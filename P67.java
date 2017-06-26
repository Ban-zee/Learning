import java.io.*;
class P67
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence");
		String S=k.readLine();
		String A[]=S.split(" ");
		int i,m,g=0,j;
		m=A.length;
		for(i=0;i<m;++i)
		{
			if(i==0||A[i].length()>g)
			{
				g=A[i].length();
			}
		}
		for(i=0;i<A.length;++i)
		{
			m=g-A[i].length();
			for(j=1;j<=m;++j)
			{
				A[i]=A[i]+" ";
			}
		}
		j=0; m=0;
		for(i=0;i<g;++i)
		{
			for(j=0;j<A.length;++j)
			{
				System.out.print(A[j].charAt(m)+"\t");
			}
			System.out.println("");
			m++;
		}
	}
}