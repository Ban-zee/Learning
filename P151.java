import java.io.*;
class P151
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String S=k.readLine();
		int x=S.length();
		int i,c=0;
		for(i=0;i<x-1;++i)
		{
			if(S.charAt(i+1)-S.charAt(i)!=2){c=1;}
		}
		if(c==0){System.out.println("Valid");}
		else{System.out.println("Invalid");}
	}
}