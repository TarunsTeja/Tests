import java.util.Scanner;
public class sample {
	  

	public static void main(String []args){
		
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int intArray[];
	        intArray = new int[n];
	        //intArray[0]=1;
	        int i;
	        for(i =1;i<=intArray.length-1;i++){
	        	if(n%i==0){
	        		intArray[i]=i;
	        	}
	        }
	        int sum=0;
	        for( int num : intArray) {
	            sum = sum+num;
	        }
	        sum=sum+n;
	        System.out.println("Sum of array elements is:"+sum);
	  }
	  
}
