import java.io.*;
import java.util.*;
class Binary
{
	int num;
	Binary(int x)
	{
		num=x;
	}
	int remainder(int n)
	{
		int r;
		String A="";
		while(n!=0)
		{
			r=n%2;
			A=String.valueOf(r)+A;
			n=n/2;
		}
		 int d=Integer.parseInt(A);
		 return d;
	 }
	 void check()
	 {
		 int p=num;
		 System.out.println(remainder(p));
	 }
 }
 class P26
 {
	 public static void main(String[]args)throws IOException
	 {
		 BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Number");
		 int no=Integer.parseInt(k.readLine());
		 Binary ob=new Binary(no);
		 ob.check();
	 }
 }