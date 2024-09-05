import java.io.PrintWriter;
public class Helloworld {
  public static void main (String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, GitHub!");
    pen.flush();
    pen.close();
  } // main(String[])
  
}
