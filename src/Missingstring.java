import java.util.*;  
import java.lang.*;
public class Missingstring{  
public static void main(String args[]){

String result1[];
String result2[];
ArrayList<String> al=new ArrayList<String>();  
al.add("Ausha");  
al.add("");  
al.add("Afzal");  
al.add("Dhanu");
al.add("    ");
al.add("                       ");

for(int i =0;i<=al.size();i++){
	String a =al.get(i);
	if(a.trim().length() == 0)
	{ 
		System.out.println("Empty");
	}
	else
	{
		System.out.println(a);
	}
}

  
}  
	
	
}  
