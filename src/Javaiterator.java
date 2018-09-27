import java.util.*;
public class Javaiterator{

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        ArrayList mylist1 = new ArrayList();  
        mylist.add("42");
        mylist.add("10");
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
           if(element == "###"){
        	   while(it.hasNext()){
        		//mylist1.add(it.next());
        	   System.out.println(it.next());
        	  // System.out.println(mylist1.size());
           }
           }else{it.remove();}
        }
    }
}