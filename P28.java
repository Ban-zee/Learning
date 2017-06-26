import java.io.*;
class Perfect
{
	int perfect(int x)
	{
		int i,s=0;
		for(i=1;i<x;++i)
		{
			if(x%i==0)
			{
				s=s+i;
			}
		}
		if(s==i){return 1;}
		else{return 0;}
	}
	void acceptData(int n)
	{
		if(perfect(n)==1)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}
	}
}
class P28
{
	public static void main(String[]args)throws IOException
	{
		Perfect r=new Perfect();
		r.acceptData(100);
	}
}