package SDE_Task5;
import java.util.*;
public class D5Que2 
{
  public static Stack<Integer> s;
  public D5Que2()
  {
	s=new Stack<>();
  }
  public void input(int x)
  {
	  s.push(x);
  }
  public int add()
  {
	  int a=s.pop();
	  int b=s.pop();
	  s.push(b);
	  s.push(a);
	  return s.push(a+b);
  }
  public int doub()
  {
	  return s.push(s.peek()*2);
  }
  public void remove()
  {
	   s.pop();
  }
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  String ssplit[]=str.split(" ");
	  int len=ssplit.length;
	  D5Que2 q=new D5Que2();
	  for(String s:ssplit)
	  {
		  if(s.equals("c"))
			  q.remove();
		  else if(s.equals("d"))
			  q.doub();
		  else if(s.equals("+"))
			  q.add();
		  else
			 q.input(Integer.parseInt(s));
	  }
	  int res=0;
	  while(!s.isEmpty())
	  {
		  res+=s.pop();
	  }
	  System.out.println(res);
  }
 }
