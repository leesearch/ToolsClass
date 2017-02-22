package IoDemo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by lsq on 1/1/17.
 */
public class RafDemo {
    public static void main(String args[]) throws IOException {
        File demo=new File("demo");
        if(!demo.exists()){
            demo.mkdir();
        }
        File file=new File(demo,"raf.dat");
        if(!file.exists()){
            file.createNewFile();
        }

        RandomAccessFile raf=new RandomAccessFile(file,"rw");
        System.out.println(raf.getFilePointer());

        raf.write('A');
        System.out.println(raf.getFilePointer());
        raf.write('B');

        int i=0x7fffffff;
        raf.write(i>>>24);
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);

        raf.writeInt(i);

        String s="中";
        byte[] gbk=s.getBytes("gbk");
        raf.write(gbk);
        System.out.println(raf.length());

        raf.seek(0);
        byte[] buf=new byte[(int)(raf.length())];
        raf.read(buf);

        System.out.println(Arrays.toString(buf));

        for(byte b:buf){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }

        raf.close();
    }
}
