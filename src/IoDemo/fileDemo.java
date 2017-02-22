package IoDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by lsq on 1/1/17.
 */
public class fileDemo {
    public static void main(String args[]) throws IOException {
        File dir=new File("/home/lsq","javaio");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("success");
        }

        File file=new File("/home/lsq/javaio","daily.txt");
        if(!file.exists()){
            file.createNewFile();
            System.out.println("createNewFile");
        }
        System.getProperties();
        System.out.println(file);
        System.out.println(file.getAbsoluteFile());
        System.out.println(dir.getParent());
        System.out.println(file.getParent());
    }
}
