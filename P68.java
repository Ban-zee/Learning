import java.io.*;
class P68
{
	static int parseInt(String S)
	{
		int a[]={0,1,2,3,4,5,6,7,8,9};
		char m[]={'0','1','2','3','4','5','6','7','8','9'};
		int i,n,j,s=0,x=0;
		n=S.length();
		for(i=0;i<n;++i)
		{
			char ch=S.charAt(i);
			for(j=0;j<10;++j)
			{
				if(m[j]==ch){x=j;break;}
			}
			if(x!=0)
			s=s*10+a[x];
		}
		return s;
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String S=k.readLine();
		int x=parseInt(S);
		System.out.println(x+"\t"+(x+9));
	}
}