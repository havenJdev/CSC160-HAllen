import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		File myFile = new File("FileWriteTest");
		if(!myFile.exists()) {
			myFile.createNewFile();
		}

//		PrintWriter printWriter = new PrintWriter(myFile.getName());
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(myFile.getName(), true));
		
		printWriter.println("Not test");
		if(printWriter.checkError()) {
			System.out.println("There were errors");
		}
		printWriter.close();
	}
	
//	public static int numCharsWritten() throws Exception {
//		throw new Exception("Not implemented yet");
//	}
}
