import java.io.*;
public class FileWriter{
  public static void main(String[] args) throws IOException {
    FileOutputStream f=new FileOutputStream("Rahul.txt",true);
    System.out.println("succefull creat");
   String str=javax.swing.JOptionPane.showInputDialog(null, "Enter the text");
     byte b[]=str.getBytes();
     f.write(b);
     System.out.println("input data successfull");
  }
}