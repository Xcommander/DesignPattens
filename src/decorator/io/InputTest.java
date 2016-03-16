package decorator.io;

import java.io.*;

/**
 * Created by xulinchao on 2016/3/14.
 */
public class InputTest {
    public static void main(String[] args) throws FileNotFoundException {
        int c;
        InputStream  s=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("Lower.txt")));
        try {
            while((c=s.read())>=0){
                System.out.print( (char)c);
                
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
