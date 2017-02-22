package IoDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by lsq on 1/3/17.
 */
public class IoUtilsTestCopyByBuffered {
    public static void main(String args[])throws IOException{
        //IoUtils.copyFileByBuffered(new File("/home/lsq/javaio/javaio.java"),new File("/home/lsq/javaio/a.txt"));
        long start=System.currentTimeMillis();
        IoUtils.copyFile(new File("/home/lsq/javaio/javaio.java"),new File("/home/lsq/javaio/copy3.java"));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
