/* Chef received N candies on his birthday. He wants to put these candies in some bags. 
A bag has K pockets and each pocket can hold at most M candies. 
Find the minimum number of bags Chef needs so that he can put every candy into a bag.
4
6 2 3     1
3 1 2     2
8 4 1     2
25 4 2    4 */
import java.util.*;
import java.lang.*;
import java.io.*;
class Scenario_12
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=(int)Math.ceil(a/(float)c);
		    int bag=1;
		    if(d>b)
		    {
		        bag=(int)Math.ceil(d/(float)b);
		    }
		    System.out.println(bag);
		}
	}
}
