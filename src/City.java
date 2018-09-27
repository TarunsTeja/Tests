import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;



public class City {
	int x,y,t;
	public City(int x,int y,int t) {  
	    this.x = x;    
	    this.y = y; 
	    this.t = t;  
	}  
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int u[]=new int[m];
		int v[]=new int[m];
		int t[]=new int[m];
		//String formatted = String.format("%03d", m);
		//System.out.println(formatted);
		HashSet<City> set=new HashSet<City>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<=m-1;i++){
			u[i]=sc.nextInt();
		}
		for(int i=0;i<=m-1;i++){
			v[i]=sc.nextInt();
		}
		for(int i=0;i<=m-1;i++){
			t[i]=sc.nextInt();
		}
		
		for(int i=0;i<=m-1;i++){
			 City b1=new City(u[i],v[i],t[i]);
			 set.add(b1);  
		}
		int o = set.size();
		String arr[] = new String[o];
		int arr1[] = new int[o];
		int z = 0;
		 for(City b:set){  
			 arr[z] =b.x+""+b.y+" "+b.t; 
			 arr1[z]=Integer.parseInt(b.x+""+b.y);
			 z++;
			    }  
		 //squares and Distance btwn them,
for(int i=0;i<=arr.length-1;i++){
	String[] parts = arr[i].split(" ");
	for (int h = 0; h < parts.length; h += 2) {
	 map.put(Integer.parseInt(parts[h]),Integer.parseInt(parts[h + 1]));
	}	
		 } 
for (Integer s : map.keySet()) {
    System.out.println(s + " is " + map.get(s));
    
}
System.out.println("************************");
 //Business Logic starts here

//for (Integer s : map.keySet()) {
	int i =1;
	String x="0";
	int res[] = new int[o];
	System.out.print("Hi");
	if(( "" + arr1[i] ).contains( x ) ){
	res[1]=arr1[i];
	System.out.println(res[0]);
	}
	i++;
//}
	}

}
