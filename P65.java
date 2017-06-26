import java.io.*;
class P65
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentece");
		String S=k.readLine();
		String A="",B="";
		S=S+" ";
		int i,n,z=0,j,m=0;
		char ch;
		n=S.length();
		for(i=0;i<n;++i)
		{
			if(S.charAt(i)!=' '){A=A+S.charAt(i);}
			else
			{
				for(j=0;j<A.length();++j)
				{
					ch=A.charAt(j);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						z=j;m=1;
						break;
					}
				}
				if(m==1){B=B+A.substring(z,A.length())+A.substring(0,z)+"ay"+" ";}
				else{B=B+A+"ay";}
				A="";
			}
		}
		System.out.println(B);
	}
}