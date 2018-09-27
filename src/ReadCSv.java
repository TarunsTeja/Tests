
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;  

public class ReadCSv {
	 public static void main(String[] args) throws IOException {
		    Scanner sc=new Scanner(System.in);
	        String csvFile = "C:/Users/KOGENTIX/Desktop/temp.csv";
	        BufferedReader br = null;
	        String line = "";
	        System.out.println("The the delimiter you need !");  
	        String cvsSplitBy = sc.next();
	        
	       
	          
	        try {

	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {
	            	
	            	if(line.contains(",")|| line.contains("	") || line.contains(":") || line.contains(";")){
	            	
	            	String[] a = line.split(cvsSplitBy);
	            	System.out.println(a[1]);
	            	}else {
	            		if( line instanceof String ) {
		            		  System.out.println("Single Column");
		            		  System.out.println(line);
		            		  break;
		            		}
	            	}
	            	
	            }

}catch (FileNotFoundException e) {
    e.printStackTrace();
}catch(ArrayIndexOutOfBoundsException exception) {
	System.out.println("Improper delimiter");
}finally {
    if (br != null) {
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

}
	 }
