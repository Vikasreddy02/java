package corejava;
import java.util.*;
public class treeset {
	
	public static void main(String args[]){  
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("shiva");  
		set.add("shakti");  
		set.add("prasad");  
		set.add("tejas");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  
