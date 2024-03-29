package SDE_Task5;
import java.util.*;
public class D5Que1 {
	Queue<Integer> q;
   public D5Que1()
   {
	   q=new LinkedList<Integer>();
   }
   public void push(int x)
   {
	   q.add(x);
   }
   public int time(int k)
   {
	   int count=0;
	   while(k>0)
	   {
		   int size=q.size();
		   for(int i=0;i<size;i++)
		   {
			   if(q.peek()==0)
				   q.poll();
			   else
			   {
			   q.add(q.poll()-1);
			   count++;
			   }
		   }
		   k--;
		   System.out.println(count);
	   }
	   return count;
   }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String str=sc.nextLine();
	   String strsplit[]=str.split(" ");
	   int len=strsplit.length;
	   int ar[]=new int[len];
	   System.out.println(len);
	   int kk=sc.nextInt();
	   D5Que1 d=new D5Que1();
	   for(int i=0;i<len;i++)
	   {
		   ar[i]=Integer.parseInt(strsplit[i]);
		   d.push(ar[i]);
	   }
	   System.out.println(d.time(ar[kk]));
   }
   
}
