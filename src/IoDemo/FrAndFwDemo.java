package IoDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by lsq on 1/4/17.
 */
public class FrAndFwDemo {
    public static void main(String[] args)throws IOException{
        FileReader fr=new FileReader("/home/lsq/javaio/curtain.txt");
        FileWriter fw=new FileWriter("/home/lsq/javaio/fWrite.txt",true);
        char[] buffer=new char[8 * 1024];
        int c;
        while ((c=fr.read(buffer,0,buffer.length)) != -1){
            fw.write(buffer,0,c);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
