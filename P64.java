import java.io.*;
class P64
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		int n=Integer.parseInt(k.readLine());
		int i;
		String A="";
		for(i=1;i<=n;++i)
		{
			if(i%2==0){A="0"+A;}
			else{A="1"+A;}
			System.out.println(A);
		}
	}
}