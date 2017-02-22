package IoDemo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lsq on 1/2/17.
 */
public class FileOutDemo {
    public static void main(String args[]) throws IOException {
        FileOutputStream fos=new FileOutputStream("/home/lsq/javaio/javaio.java",true);
        fos.write('A');
        int a=10;
        fos.write(a>>>24);
        fos.write(a>>>16);
        fos.write(a>>>8);
        fos.write(a);
        byte[] buf="中国".getBytes("utf-8");
        fos.write(buf);
        fos.close();

        IoUtils.printHex("/home/lsq/javaio/javaio.java");
    }
}
