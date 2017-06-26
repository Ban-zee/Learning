import java.io.*;
class P147
{
int n;
boolean result;
P147(int x,boolean y)throws IOException
{
n=x;
result=y;
}
int factorial(int n)
{
return(n==0)?1:n*factorial(n-1);
}
boolean is_special()
{
return(factorial(n)==n);
}
void display()
{
	System.out.println(factorial(n));
if(factorial(n)==n){System.out.println("Special Number");}
else{System.out.println("Not a Special Number");}
}
public static void main(String[]args)throws IOException
{
BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number");
int n=Integer.parseInt(k.readLine());
boolean result=false;
P147 r=new P147(n,result);
r.display();
}
}