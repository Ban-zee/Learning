import java.io.*;
class P48
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String A[]={"Lucknow","Kanpur","Varanasi"};
		String n[]={"0522","0512","0542"};
		String S=k.readLine();
		int i;
		for(i=0;i<A.length;++i)
		{
			if(A[i].equalsIgnoreCase(S))
			{
				System.out.println(n[i]);
				break;
			}
		}
	}
}