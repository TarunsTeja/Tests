import java.util.ArrayList;
import java.util.Arrays;

public class FilmsList {
	static int s = 0;
	static int count = 0;
	static int r = 0;
	static ArrayList<Integer> ar = new ArrayList<Integer>();
	static Integer mm[];
	public static void main(String args[]) {
		// ArrayList<Integer> ar = new ArrayList<Integer>();
		Integer[] array = {-1,-2,-3,-4,-5};
	//	Integer[] array = {-3,2,4,-1,-2,-5};
	//	Integer[] array = {9,-1,-3,4,5};
		int n = array.length;
		int a = 0;
		try {
			for (int i = 0; i <= array.length - 1; i++) {
				if (array.length <= 3) {
					break;
				} else {
					ArrayList<Integer> newarr = new ArrayList<Integer>(
							Arrays.asList(array));
					newarr.removeAll(Arrays.asList(Integer.valueOf(0)));
					array = newarr.toArray(new Integer[newarr.size()]);
					Addelement(array, n);
					array[i] = a;
					array[(n - i) - 1] = a;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// Empty Block
		}
		/*
		 * for(int i = 0;i < ar.size();i++){ System.out.println(ar.get(i)); }
		 */
		int[] ret = new int[ar.size()];
		for (int i = 0; i < ret.length - 1; i++) {
			ret[i] = ar.get(i);
			//System.out.println(ret[i]);
		}
		int max = ret[0];
		
		//System.out.println("******************************" );
		for (int i = 1; i <= ret.length-1; i++) {
			if(ret[i]==0)
				continue;
			if (ret[i] > max) {
				max = ret[i];
			}
			//System.out.println("inside loop:"+max);
		}
		System.out.println(max);
	}
	public static void Addelement(Integer[] q, int u) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// int a=0;
		for (int i = 0; i <= u - 1; i++) {
			if (q.length < 3) {
				break;
			} else {
				try {
					int a = q[i];
					// System.out.println("first element is  "+q[i]);
					// System.out.println("*****************************");
					for (int k = 0; k <= q.length - 1; k++) {
						if (q[k] == a) {
							continue;
						}
						list.add(q[k]);
						// System.out.println(list.size());
					}
					for (int j = 0; j <= list.size() - 1; j++) {
						s = s + list.get(j);
					}
					list.clear();
					// System.out.println(s);
					ar.add(s);
					int gen = 0;
					s = gen;
				} catch (ArrayIndexOutOfBoundsException e) {
					// Empty Block
				}
			}
		}
	}
}