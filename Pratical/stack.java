package corejava;
import java.util.*;
public class stack {
	
	
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Prasad");  
		stack.push("Pratik");  
		stack.push("Rohit");  
		stack.push("Kishor");  
		stack.push("Rushab");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  
