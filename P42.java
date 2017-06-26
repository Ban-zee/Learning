import java.io.*;
import java.util.*;
class P42
{
	int a,b;
	void accept()
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=r.nextInt();
		b=r.nextInt();
	}
	int check(int x)
	{
		int i,c=0;
		for(i=1;i<=x;++i)
		{
			if(x%i==0)
			{c++;}
		}
		if(c==2){return 1;}
		else {return 0;}
	}
	void display()
	{
		int j;
		if(b-a==2&&check(b)==1&&check(a)==1)
		{
			for(j=b;;j++)
			{
				if(check(j)==1&&check(j+2)==1)
				{
					System.out.println(a+"\t"+b);
					System.out.println(j+"\t"+(j+2));
					break;
				}
			}
		}
		else
		{
			System.out.println("Not co-prime numbers");
		}
	}
	public static void main(String[]args)throws IOException
	{
		P42 ob=new P42();
		ob.accept();
		ob.display();
	}
}