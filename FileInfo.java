import java.io.*;
public class FileInfo {
      public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\hp\\Desktop\\tota.txt");
            if (f.exists()) {
                  System.out.println("file name"+f.getName());
                  System.out.println("file path"+f.getAbsolutePath());
                  System.out.println("file Witebla"+f.canWrite());
                  System.out.println("file Read"+f.canRead());
                  System.out.println("file Size"+f.length());   
            }else{
                System.out.println("File dosnt exti");
            }
      }
}
