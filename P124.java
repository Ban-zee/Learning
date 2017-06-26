import java.io.*;
class P124
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String S=k.readLine();S=S.substring(0,S.length()-1);
		String A[]=S.split(" ");
		int i,m=A.length,j;
		String t="";
		for(i=1;i<m;++i)
		{
			for(j=0;j<m-i;++j)
			{
				if(A[j].length()>A[j+1].length())
				{
					t=A[j];
					A[j]=A[j+1];
					A[j+1]=t;
				}
			}
		}
		for(i=0;i<m;++i)
		{
			System.out.print(A[i]+" ");
		}
		System.out.print(".");
	}
}
