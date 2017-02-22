package IoDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by lsq on 1/1/17.
 */
public class FileUtilsTest {
    public static void main(String args[]) throws IOException{
    FileUtils.listDirectory(new File("/home/lsq/Documents/"));
    }
}
