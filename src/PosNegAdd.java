import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class PosNegAdd {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] lis = new int[n];
	int[] lis2 = new int[n];
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> ar = new ArrayList<Integer>();
	int tot=0;
	int sum = 0,max=0;
	for(int i=0;i<=n-1;i++){
		lis[i]=sc.nextInt();
	}
	
	/*for(int i = 0; i <= lis.length-1; i++)
    {
		
		sum= sum+lis[i];
		
    }
	System.out.println("sum ="+sum);
	for(int i = 0; i <= lis.length-1; i++){
		lis2[i]=sum-lis[i];
	}
	max=lis2[0];
	for(int i = 0; i <= lis.length-1; i++){
		//System.out.println(lis2[i]);
		if (lis2[i] > max){
			 max=lis2[i];		 }
	}
	System.out.println(max);*/
	
	for (int i = 0; i < lis.length - 1; i++) {
		int a = lis[i];
		for (int k= 0; k < lis.length - 1; k++) {
			if (lis[k] == a) {
                continue;
            } 
			list.add(lis[k]);
			
		}}
		for(int i = 0; i <= lis.length-1; i++){
		    list.add(lis[i]);
		   }
		for(int i = 0; i <= lis.length-1; i++){
			int a=0;
			list.stream().skip(i).forEach((b) -> System.out.println(b));
		     
		}
	
	
	/*
	
	for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
	}
	System.out.println("*******");
	System.out.println(ar.size());*/
}
}

