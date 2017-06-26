import java.io.*;
class P144
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(k.readLine());
		String S=(n+"")+((n*2)+"")+((n*3)+"");
		int x=S.length();
		System.out.println(S);
		char i;
		int j,m=0,c=0;
		boolean t=true;
		for(i='1';i<='9';++i)
		{
			for(j=0;j<x;++j)
			{
				if(S.charAt(j)==i){m=m+1;}
			}
			if(m==1){c=c+1;m=0;}
			else
			{break;}
		}
		if(c==9)
		{
			System.out.println("Fantastic number");
		}
		else
		{
			System.out.println("Sorry");
		}
	}
}