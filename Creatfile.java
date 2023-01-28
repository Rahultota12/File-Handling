import java.io.File;
import java.io.IOException;

public class Creatfile{
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\hp\\Desktop\\tota.txt");
        if (f.createNewFile()) {
            System.out.println("Successfull file creat");
        }
        else{
            System.out.println("file Alreading exits");
        }
    }
}