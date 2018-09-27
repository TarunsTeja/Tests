import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Readfile {

	private static final String FILENAME = "D:/NPD.csv";
	
	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				String[] a = sCurrentLine.split(",");
				if(a[3].length() > 20){
					System.out.println("error");
				}
				else{System.out.println(a[3]);}
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
