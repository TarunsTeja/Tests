import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class MaxDiff {
	public static int count=0;
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	int[] subres = new int[n];
	int[] endarr = new int[1000];
	ArrayList<Integer> list=new ArrayList<Integer>();
	Set<Integer> hs = new HashSet<Integer>();
	int p=0;
	//taking elementsinto array
	for(int i=0;i<=n-1;i++){
		arr[i]=sc.nextInt();
	}
	//logic
	for(int i=0;i<n-1;i++){
		int x = arr[i+1];
		for(int k=0;k<i+1;k++){
			if(arr[k]<x){
				subres[k]=x-arr[k];
			}
		}
		
		
			for (int id: subres) {
			
				list.add(id);
			}
		
		}

	hs.addAll(list);
	list.clear();
	list.addAll(hs);
	Iterator iterator = hs.iterator();
	int lastElement = (Integer)iterator.next();
	while(iterator.hasNext()){
		lastElement = (Integer)iterator.next();
		}
	System.out.println(lastElement);
}

}

