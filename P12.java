import java.io.*;
class P12
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word");
		String S=k.readLine();S=S+" ";
		int i,n,j,x;
		String A="",B="";
		n=S.length();
		for(i=0;i<n;++i)
		{
			if(S.charAt(i)!=' ')
			{
				A=S.charAt(i)+A;
				B=B+S.charAt(i);
			}
			else
			{
				System.out.print(B);
				System.out.println("");
				for(j=0;j<A.length();++j)
				{
					System.out.print(B.charAt(j));
					for(x=1;x<A.length()-1;++x)
					{
						System.out.print(" ");
					}
					System.out.print(A.charAt(j));
					System.out.println("");
				}
				System.out.print(A);
				System.out.println("");
				A="";B="";
			}
		}
	}
}