
import java.util.ArrayList;


public class MovList {
	public static void main(String[] args) {

        int[] array = { 2, 4, 5, 6, 8, 6, 3, 4, 6 };
        ArrayList<Integer> list = new ArrayList<Integer>(); 

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 6) {
                continue;
            } 
            list.add(array[i]);
        }

        System.out.println(list);
    }
}
