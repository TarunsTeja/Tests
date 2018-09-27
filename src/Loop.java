import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Loop {
	static int s=0;
public static void main(String args[]){
	Integer[] numbers = {1, 3, 6, 0, 4, 0, 3};
	System.out.println(numbers.length);
	ArrayList<Integer> newarr = new ArrayList<Integer>(Arrays.asList(numbers));
	newarr.removeAll(Arrays.asList(Integer.valueOf(0)));
	numbers = newarr.toArray(new Integer[newarr.size()]);
	System.out.println(Arrays.toString(numbers));
	System.out.println(numbers.length);


		
}
}
//}