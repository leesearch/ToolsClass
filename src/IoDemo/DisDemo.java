package IoDemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by lsq on 1/3/17.
 */
public class DisDemo {
    public static void main(String args[])throws IOException{
        String file="/home/lsq/javaio/out.dat";
        IoUtils.printHex(file);
        DataInputStream dis=new DataInputStream(new FileInputStream(file));
        int i=dis.readInt();
        System.out.println(i);
        i=dis.readInt();
        System.out.println(i);
        double d=dis.readDouble();
        String str=dis.readUTF();
        System.out.println(str);
        dis.close();
    }
}
