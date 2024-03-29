package SDE_Task5;
import java.util.*;
public class D5Que3 {
    public static String removeOuterParentheses(String s)
    {
    	Stack<Character> stack=new Stack<Character>();
        if(s.length()==0)
        return "";
        int count=0;
        int start=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
            if(count==0)
            {
                sb.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	System.out.println(removeOuterParentheses(str));
    }
}
