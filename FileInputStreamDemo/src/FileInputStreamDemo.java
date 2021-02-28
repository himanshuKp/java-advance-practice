import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fls = null;

        try{
            fls = new FileInputStream(new File("F:\\personal\\Files\\myfile.txt"));
            System.out.println("File opened");

            int i;
            while((i=fls.read())!=-1){
                System.out.print((char) i);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fls.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\nFile closed");
        }
    }
}
