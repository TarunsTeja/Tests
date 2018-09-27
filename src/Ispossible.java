import java.util.Scanner;


public class Ispossible {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int x = 0;
	boolean end = true;
	while(end == true) {
		
		x = b+a;
		a=x;
		b=x+b;
		if(a==c && b==d){
			System.out.println("Yes");
			end=false;
			}else
			{System.out.println("No");
			end=false;
			}
		}
}
	
}

