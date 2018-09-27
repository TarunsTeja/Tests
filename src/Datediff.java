

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datediff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dateStart = String.valueOf(sc.nextInt());
		String endate= String.valueOf(sc.nextInt());

		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(endate);

			
			long diff = d2.getTime() - d1.getTime();

			
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays);
		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}