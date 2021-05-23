import java.io.*;

public class IOExample {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("C:\\Users\\79107\\Desktop\\Example.txt");
        is.skip(2);
        System.out.println((char) is.read());
        System.out.println((char) is.read());

        File file = new File("C:\\Users\\79107\\Desktop\\Example2.txt");
        OutputStream os = new FileOutputStream(file);
        String str = "Люблю Java!";
        byte[] string = str.getBytes();
        os.write(string);


    }
}
