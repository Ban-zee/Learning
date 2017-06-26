import java.io.*;
class P63
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		String S=k.readLine();
		String A[]=S.split(" ");
		int i,n,j,x,u=0,g;
		n=A.length;
		g=A[0].length();
		for(i=0;i<n;++i)
		{
			if(A[i].length()>g){g=A[i].length();}
		}
		String B[]=new String[g];
		x=g-n;
		for(i=0;i<g;++i)
		{
			x=g-A[i].length();
			for(j=1;j<=x;++j)
			{
				A[i]=A[i]+" ";
			}
			B[i]=A[i];
		}
		for(i=n-1;i<g;++i)
		{
			B[i]=B[i]+" ";
		}
		for(i=0;i<g;++i)
		{
			x=0;
			for(j=0;j<g;++j)
			{
				System.out.print(B[x].charAt(u)+"\t");
				x++;
			}
			u++;
			System.out.println("");
		}
	}
}