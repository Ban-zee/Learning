import java.io.*;
class P37
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the sentence");
		String S=k.readLine();S=S+" ";
		int i,n,j,c=0;
		String A="";
		n=S.length();
		for(i=1;i<=10;++i)
		{
			for(j=0;j<n;++j)
			{
				if(S.charAt(j)!=' '){A=A+S.charAt(j);}
				else
				{
					if(A.length()==i){c++;}
					A="";
				}
			}
			if(c!=0)
			{
				System.out.println(i+" letter words are"+"\t"+c);
			}
			c=0;
		}
	}
}