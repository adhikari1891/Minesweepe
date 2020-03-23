import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {
	
		private static BufferedWriter bw;
	
	private MyFileWriter() throws IOException {
		bw = new BufferedWriter(new FileWriter("filename.txt"));
		this.bw = bw;
	}

	public void write(String string) throws IOException{
		bw.append(string);
	}

	public static MyFileWriter getInstance() throws IOException {
		MyFileWriter instance = new MyFileWriter();
		return instance;
	}

	public void close() throws IOException{
	bw.close();

	}
}
