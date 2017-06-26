import java.io.*;
class P155
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		char text[]={'J','a','M','e','S',' ','B','O','n','D'};
		int len=text.length;
		int a;
		for(a=0;a<text.length;++a)
		{
			if(Character.isLowerCase(text[a]))
			{
				text[a]=Character.toUpperCase(text[a]);
			}
			else if(Character.isUpperCase(text[a]))
			{
				if(a%2==0)
				{
					text[a]=Character.toLowerCase(text[a]);
				}
				else
				{
					text[a]=text[a-1];
				}
			}
			System.out.println(text[a]);
		}
		int x,j=1,n=30,dd=2;
		int arr[]={2,0,0,0,0,0,0,0,0,0};
		while(dd<=n)
		{
			for(x=2;x<dd;++x)
			{
				if(dd%x==0){break;}
				else if(x==dd-1){arr[j++]=dd;}
			}
			dd++;
		}
		for(x=0;x<10;++x)
		{
			System.out.println(arr[x]);
		}
	}
}