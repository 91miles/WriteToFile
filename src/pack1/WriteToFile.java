package pack1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile {
  public static void main(String[] args) throws IOException {
    File fout = new File("out.txt");
    FileOutputStream fos = new FileOutputStream(fout);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    for (int i = 0; i < 10; i++) {
      bw.write("something");
      bw.newLine();
      bw.flush();
    }
    bw.close();
  }
}
