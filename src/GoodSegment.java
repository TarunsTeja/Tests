import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class GoodSegment {

    /*
     * Complete the 'goodSegment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY badNumbers
     *  2. INTEGER l
     *  3. INTEGER r
     */

    public static int goodSegment(List<Integer> badNumbers, int l, int r) {
    // Write your code here
    	int a =badNumbers.size();
   	 Collections.sort(badNumbers);
   	  
   	 int[] intArr = new int[a];
   	 int[] newarr = new int[a];
   	 int l1 =1,u=r;
   	  
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
   	 //System.out.println("*********************");
   	 int max = intArr[0];
   	 int max1 = intArr[0];
   	 for(int i=1;i<=intArr.length-1;i++){
   		 if (intArr[i] > max){
   			 max = intArr[i];
   		 }
   	 
   	 }
   	 for(int i=0;i<=intArr.length-1;i++){
   	 if(newarr[i]<=0){
   		 newarr[i]=newarr[0]-l1-1;break;//
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
   	 return max1;
}
public class Solution {
    public void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int badNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> badNumbers = new ArrayList<Integer>();

        for (int i = 0; i < badNumbersCount; i++) {
            int badNumbersItem = Integer.parseInt(bufferedReader.readLine().trim());
            badNumbers.add(badNumbersItem);
        }

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.goodSegment(badNumbers, l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
}

