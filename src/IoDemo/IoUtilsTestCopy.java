package IoDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by lsq on 1/3/17.
 */
public class IoUtilsTestCopy {
    public static void main(String args[]) throws IOException {
        IoUtils.copyFile(new File("/home/lsq/javaio/javaio.java"),new File("/home/lsq/javaio/javacopy.java"));
    }
}
