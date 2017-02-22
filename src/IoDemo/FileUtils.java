package IoDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by lsq on 1/1/17.
 */
public class FileUtils {
    public static void listDirectory(File dir)throws IOException{
        if(!dir.exists()){
            throw new IllegalArgumentException("目录"+dir+"不存在");
        }
        if(!dir.isDirectory()){
            throw new IllegalArgumentException(dir+"不是文件夹啊");
        }
        String[] fileName=dir.list();
        for(String str:fileName){
            System.out.println(dir+"/"+str);
        }

        File[] files=dir.listFiles();
        if(files!=null&&files.length>0){
            for(File file:files){
                if(file.isDirectory()){
                    listDirectory(file);
                }
            }
        }
    }
}
