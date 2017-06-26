import java.io.*;
class P117
{
	static int sod(int n)
	{
		return(n==0)?0:n%10+sod(n/10);
	}
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		{
			System.out.println("Enter the value of m&n");
			int m=Integer.parseInt(k.readLine());
			int n=Integer.parseInt(k.readLine());
			int i,c;
			for(i=m+1;;++i)
			{
				if(sod(i)==n)
				{
					c=i;break;
				}
			}
			System.out.println(c);
		}
	}
}