package SDE_Task5;
import java.util.*;
public class D5Que4 {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String input=sc.nextLine();
    	String ssplit[]=input.split(" ");
    	int ar[]=new int[ssplit.length];
    	for(int i=0;i<ssplit.length;i++)
    	{
    		ar[i]=Integer.parseInt(ssplit[i]);
    	}
    	Map<Integer,Integer> m=new HashMap<>();
    	for(int i=0;i<ar.length;i++)
    	{
    		if(m.containsKey(ar[i]))
    			m.put(ar[i],m.get(ar[i])+1);
    		else
    			m.put(ar[i],1);
    	}
    	int res[]=new int[ar.length];
    	Stack<Integer> s=new Stack<Integer>();
    	int i=0;
    	while(i<ar.length)
    	{
    		while(!s.isEmpty() && m.get(ar[i])>m.get(ar[s.peek()]))
    		{
    			res[s.peek()]=ar[i];
    			s.pop();
    		}
    		s.push(i);
    		i++;
    	}
    	while(!s.isEmpty())
    	{
    		res[s.pop()]=-1;
    	}
    	for(int j=0;j<res.length;j++)
    	{
    		System.out.print(res[j]+" ");
    	}
    }
}
