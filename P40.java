import java.io.*;
class P40
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String A[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String B[]={" "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		System.out.println("Enter a number");
		int n=Integer.parseInt(k.readLine());
		int p=n,d=0,q,r,i,z,y;
		while(p!=0)
		{
			p=p/10;
			d++;
		}
		if(d==2)
		{
			if(n>=0&&n<20)
			{
				System.out.println(A[n]);
			}
			else if(n>=20)
			{
				q=n/10;
				r=n%10;
				if(r!=0)
				{
					System.out.println(B[q]+" "+A[r]);
				}
				else
				{
					System.out.println(B[q]);
				}
			}
		}
		else if(d==3)
		{
			q=n/100;
			r=n%100;
			z=r/10;
			y=r%10;
			if(r>=11&&r<=20)
			{
				System.out.println(A[q]+" hundred"+" and "+A[r]);
			}
			else if(z==0&&y==0)
			{
				System.out.println(A[q]+" hundred");
			}
			else if(z!=0&&y!=0)
			{
				System.out.println(A[q]+" hundred and "+B[z]+" "+A[y]);
			}
			else if(z==0&&y!=0)
			{
				System.out.println(A[q]+" hundered and "+A[y]);
			}
			else if(z!=0&&y==0)
			{
				System.out.println(A[q]+" hundred "+B[z]);
			}
			else if(y==0&&z==0&&q==0)
			{
				System.out.println("zero");
			}
		}
		else if(d==1){System.out.println(A[n]);}
	}
}