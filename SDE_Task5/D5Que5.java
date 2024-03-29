package SDE_Task5;
import java.util.*;
public class D5Que5 {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String str=sc.nextLine();
	   Stack<String> s=new Stack<String>();
	   for(String ss:str.split(""))
		   s.push(ss);
	   String st="";
	   while(!s.isEmpty())
	   {
		   st+=s.pop();
	   }
	   System.out.println(Integer.parseInt(st));
   }
}
