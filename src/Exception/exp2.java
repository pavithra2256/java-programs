package Exception;

public class exp2 {
    package Exceptions;
import java.io.*;
    public class excep4 {
        public static void main(String[] args) {
            try {
                FileOutputStream obj1 = new FileOutputStream("D:\\java2.txt");
                String C="Hello world";
                byte b[]=C.getBytes();
                obj1.write(b);
                obj1.write(63);
                obj1.close();
                System.out.println("Written in the document");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

}
