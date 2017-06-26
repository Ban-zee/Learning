import java.io.*;
class P23
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String A[]={"Aniruddha","Asit","Aparna","Susmita","Methu"};
		System.out.println("Enter the name");
		String S=k.readLine();
		int i,c=0;
		while(S.equalsIgnoreCase("stop")==false)
		{
			for(i=0;i<A.length;++i)
			{
				if(A[i].equalsIgnoreCase(S)==true)
				{
					c=1;break;
				}
			}
			if(c==1)
			{
				System.out.println("Family Member");
			}
			else if(c==0)
			{
				System.out.println("Not a Family Member");
			}
			System.out.println("Enter the name");
			S=k.readLine();
			c=0;
		}
	}
}