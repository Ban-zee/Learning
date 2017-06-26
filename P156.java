`import java.io.*;
class Composite
{
	int a[][],m,n;
	Composite(int mm,int nn)
	{
		m=mm;
		n=nn;
	}
	int isComposite(int p)
	{
		int i,c=0;
		for(i=1;i<=p;++i)
		{
			if(p%i==0){c++;}
		}
		if(c==2)return 0;
		else return 1;
	}
	void fill()
	{
		a=new int[m][n];
		int i=0,j=0,c=1;
		while(i<m)
		{
			j=0;
			while(j<n)
			{
				if(isComposite(c)==1){a[i][j]=c;j=j+1;;}
				c=c+1;
			}
			i++;
		}
	}
	void print()
	{
		int i,j;
		for(i=0;i<m;++i)
		{
			for(j=0;j<n;++j)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
class P156
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(k.readLine());
		int n=Integer.parseInt(k.readLine());
		Composite r=new Composite(m,n);
		r.fill();
		r.print();
	}
}