import java.io.*;
class P47
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the year");
		int y=Integer.parseInt(k.readLine());
		if(y%4==0&&y%100!=0||y%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}
}