import java.io.*;
class P150
{
	public static void main(String[]args)throws IOException
	{

  int arr[][],arr1[];1
  int n,i,j,x=0,r,c;
  int flag;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("\nEnter the size of array(row and column same):");
   n=Integer.parseInt(br.readLine().trim());
   arr=new int[n][n];
   arr1=new int[2*n];
   for(i=0;i< n;i++)
   {
   for(j=0;j< n;j++)
   {
     System.out.println("\nEnter the value:");
     arr[i][j]=Integer.parseInt(br.readLine());
     }
     }
   System.out.println("\nThe matrix is\n");
     for(i=0;i< n;i++)
     {
     r=0;
     c=0;
      for(j=0;j< n;j++)
      {
      System.out.print(arr[i][j]+" ");
       r=r+arr[i][j];
       c=c+arr[j][i];
       }
        System.out.println();
       arr1[x]=r;
       arr1[x+n-1]=c;
       x++;
       }
       for(i=0;i< x;i++)
       {
        if(arr1[i]!= 0.5 * n * (n*n + 1))
        break;
        }
        if(i==x)
        System.out.println("YES IT REPRESENTS A WONDROUS SQUARE.");
        else
        System.out.println("IT IS NOT A WONDROUS SQUARE.");
        System.out.println("PRIME  ROW  COLUMN");
        for(i=0;i< n;i++)
        {
         for(j=0;j< n;j++)
         {
         if(prime(arr[i][j]))
         System.out.println(arr[i][j]+ "   "+i+ "   "+j);
        }
        }
        }
        private boolean prime(int no)
        {
         int index;
         for(index=2;index< no;index++)
         {
          if(no%index==0)
          break;
         }
         if(index==no)
         return true;
         else
         return false;
        }
	}