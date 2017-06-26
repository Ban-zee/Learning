import java.io.*;
class Merger
{
	long n1,n2,mergNum;
	Merger()
	{
		n1=n2=mergNum=0;
	}
	void readNum()throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values");
		n1=Long.parseLong(k.readLine());
		n2=Long.parseLong(k.readLine());
	}
	void join()
	{
		String S="";
		S=(n1+"")+(n2+"");
		mergNum=Long.parseLong(S);
	}
	void show()
	{
		System.out.println(n1+"\t"+n2+"\t"+mergNum);
	}
}
class P139
{
	public static void main(String[]args)throws IOException
	{
		Merger m=new Merger();
		m.readNum();
		m.join();
		m.show();
	}
}