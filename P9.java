import java.io.*;
class P9
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total amount");
		int amt=Integer.parseInt(k.readLine());
		int p=amt;
		int f=0,q=0,h=0,fi=0,tw=0,te=0,five=0;
		while(q>=500)
		{
			q=q%500;
			f++;
		}
		p=p-f*500;
		while(q>=100)
		{
			q=q%500;
			h++;
		}
		p=p-h*100;
		while(q>50)
		{
			q=q%500;
			fi++;
		}
		p=p-fi*50;;
		while(q>20)
		{
			q=q%500;
			tw++;
		}
		p=p-tw*20;
		while(q>10)
		{
			q=q%500;
			te++;
		}
		p=p-te*10;
		while(q>5)
		{
			q=q%500;
			five++;
		}
		p=p-te*5;
		System.out.println("500 Rs "+f);
		System.out.println("100 Rs "+h);
		System.out.println("50  Rs "+fi);
		System.out.println("20  Rs "+tw);
		System.out.println("10  Rs "+te);
		System.out.println("5   Rs "+five);
		System.out.println("1   Rs "+p);
	}
}