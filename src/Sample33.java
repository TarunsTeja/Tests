import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sample33 {

	 public static void main(String[] args) throws IOException {
	ArrayList al=new ArrayList();
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 List<Integer> badNumbers = new ArrayList<Integer>();
	 int badNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());
	 
	 for (int i = 0; i < badNumbersCount; i++) {
         int badNumbersItem = Integer.parseInt(bufferedReader.readLine().trim());
         badNumbers.add(badNumbersItem);
     }
	 
	// for( int i=0;i<= badNumbers.toArray().length;i++){
	//	 Collections.sort(arg0);
	// }
	 int a =badNumbers.size();
	 
	 Collections.sort(badNumbers);
	  
	 int[] intArr = new int[a];
	 int[] newarr = new int[a];
	 int l =3,u=48;
	  
		 for( int i=0;i<=a-1;i++){
			 int x = (Integer) badNumbers.toArray()[i];
			 if(x <=u){
			 intArr[i]=x;
			 }
	  }
	 
	 
		 //System.out.println("<<newarr List>>");
	 for(int i=0;i<=intArr.length-2;i++){
		 int x = intArr[i+1];
		 int b=intArr[i];
		 int c = x-b;
		 newarr[i]=c-1;
		 
		 //System.out.println(newarr[i]);
	 }
	 System.out.println("*********************");
	 int max = intArr[0];
	 int max1 = intArr[0];
	 for(int i=1;i<=intArr.length-1;i++){
		 if (intArr[i] > max){
			 max = intArr[i];
		 }
	 
	 }
	 for(int i=0;i<=intArr.length-1;i++){
	 if(newarr[i]<=0){
		 newarr[i]=newarr[0]-l-1;break;//
	 }
	 
	 }
	 for(int i=0;i<=intArr.length-1;i++){
		 if(newarr[i]<=0){
			 newarr[i]=u-max;break;//store 48-37 i.e u-max
			 }
}
	 for(int i=0;i<=intArr.length-1;i++){
		 if (newarr[i] > max1){
			 max1 = newarr[i];
		 }
	 }
	 System.out.println(max1);
}
}
