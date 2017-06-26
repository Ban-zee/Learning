// Array Lists are dynamic and increase their size dyanmically.Array Lists can hold different types of data within the same list.Included in java.util;
import java.io.*;
import java.util.*;
class Lists
{
	static int a[]={1,2,3,4,5,6};
	static int b[]={7,8,9,10,11,12,13,14,15};
	static int i,len;
	public static void main(String[]args)throws IOException
	{
		len=a.length;
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		for(i=0;i<len;++i)
		{
			list1.add("Hello");
		}
		for(i=0;i<b.length;++i)
		{
			list2.add(b[i]);
		}
		//list1.clear();[Clears the List]
		//list1.get(i);[Provides the element at index i] return type:object;
		//list1.add(i,x); [Inserts the element x at index i and throws out of bounds exception otherwise(Return type:void);
		//list1.add(x); [Inserts element at last];(Return type:boolean);
		//list1.clone(); [Returns a shallow copy]; Return type object;
		//list1.contains(x); Self explanatory rt:boolean;
		//list1.remove(i); Removes element at index i return type:object;
		//list1.toArray(); Self explanatory
		ArrayList list3=new ArrayList();
		list3=combine(list1,list2);
		int m;
		for(m=0;m<list3.size();++m)
		{
			System.out.println(list3.get(m));
		}
	}
	static ArrayList combine(ArrayList a,ArrayList b)
	{
		ArrayList temp=new ArrayList();
		int i;
		for(i=0;i<a.size();++i)
		{
			temp.add(a.get(i));
		}
		for(i=0;i<b.size();++i)
		{
			temp.add(b.get(i));
		}
		return temp;
	}
}