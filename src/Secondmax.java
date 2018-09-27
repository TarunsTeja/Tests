import java.util.Scanner;


public class Secondmax {
	public static void main(String args[]){
		int size,temp,min;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < size; i++)   
        {  
            for (int j = i + 1; j < size; j++)   
            {  
                if (arr[i] < arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        } 
		min = arr[1];
		System.out.println(min);
		
	}
}