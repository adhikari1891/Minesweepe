
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.*;

import java.io.IOException;
public class testMyFileWriter extends TestCase {

	public static void testMethod() throws IOException{

		MyFileWriter writer = MyFileWriter.getInstance();
		
		writer.write("Opened new writer.");

		
		MyFileWriter writer2 = MyFileWriter.getInstance();
		writer2.write("Opened another writer!");
		assertEquals(writer, writer2);
		
		writer.close();
		writer2.close();
		
		
}
}
