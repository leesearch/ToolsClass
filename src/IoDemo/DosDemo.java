package IoDemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lsq on 1/3/17.
 */
public class DosDemo {
    public static void main(String args[])throws IOException{
        String file="/home/lsq/javaio/out.dat";
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        dos.writeInt(10);
        dos.writeInt(-19);
        dos.writeDouble(10.5);
        dos.writeUTF("中国");
        dos.writeChars("中国");
        dos.close();
        IoUtils.printHex(file);
    }
}
