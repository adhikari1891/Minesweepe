import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Thread {
	public static void main(String[] args) throws FileNotFoundException {
     String filename ="file.txt";
     
     File textFile= new File(filename);
     
     Scanner in = new Scanner(textFile);
     
     
    int value = in.nextInt();
    System.out.println("Read value" + value);
    
    in.nextLine();
    
    
    int count = 2;
    
     while(in.hasNextLine()) {
    	 String line= in.nextLine();
    	 System.out.println(count + ":" + line);
     }
     
     in.close();
      
	}
}
