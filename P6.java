import java.io.*;
class P6
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word");
		String S=k.readLine();
		char i;
		int j,n=0;
		for(i='A';i<'z';++i)
		{
			for(j=0;j<S.length();++j)
			{
				if(S.charAt(j)==i)
				{
					n++;
				}
			}
			if(n!=0)
			{
				System.out.println(i+"\t"+n);
			}
			n=0;
		}
	}
}