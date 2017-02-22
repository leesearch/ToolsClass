package IoDemo;

import java.io.*;

/**
 * Created by lsq on 1/2/17.
 */
public class IoUtils {
    public static void printHex(String fileName) throws IOException {
        int b;
        int i=1;
        FileInputStream fis=new FileInputStream(fileName);
        while((b=fis.read())!=-1){
            if(b<0xf){
                System.out.print("0");
            }
            System.out.print(Integer.toHexString(b)+" ");
            if(i++%10==0){
                System.out.println();
            }
        }
        fis.close();
    }

    public static void printHexByByteArray(String fileName)throws IOException {
        FileInputStream fs=new FileInputStream(fileName);
        byte[] buf=new byte[1 * 1024];
//        int bytes=fs.read(buf,0,buf.length);//返回的是读到的字节个数，该数组足够大，可以一次性读完文件的内容。
//        int j=1;
//        for(int i=0;i<bytes;i++){
//            if(buf[i]<=0xf){
//                System.out.print("0");
//            }
//            System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
//            if(j++%10==0){
//                System.out.println();
//            }
//        }

        int bytes=0;
        int j=1;
        while((bytes=fs.read(buf,0,buf.length)) != -1){
            for(int i=0;i<bytes;i++){
                if(buf[i]< 0xf){
                    System.out.print("0");
                }
                System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
                if(j++ %10 ==0){
                    System.out.println();
                }
            }
        }
    }

    public static void copyFile(File srcFile, File destFile)throws IOException{
        if(!srcFile.exists()){
            throw new IllegalArgumentException("文件"+srcFile+"不存在");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"不是文件");
        }
        FileInputStream fileInput=new FileInputStream(srcFile);
        FileOutputStream fileOutput=new FileOutputStream(destFile);
        byte[] buf=new byte[8 * 1024];
        int b;
        while((b=fileInput.read(buf,0,buf.length)) != -1){
            fileOutput.write(buf,0,b);
            fileOutput.flush();
        }
        fileInput.close();
        fileOutput.close();
    }

    public static void copyFileByBuffered(File srcFile,File destFile)throws IOException{
        if(!srcFile.exists()){
            throw new IllegalArgumentException("文件"+srcFile+"不存在");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"不是文件");
        }
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
        int c;
        while((c=bis.read()) != -1){
            bos.write(c);
            bos.flush();
        }
        bis.close();
        bos.close();
    }

    //每次单字节不带缓冲拷贝文件
    public static void copyFileByByte(File srcFile,File destFile)throws IOException{
        if(!srcFile.exists()){
            throw new IllegalArgumentException("文件"+srcFile+"不存在");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"不是文件");
        }
        FileInputStream fis=new FileInputStream(srcFile);
        FileOutputStream fos=new FileOutputStream(destFile);
        int c;
        while((c=fis.read()) != -1){
            fos.write(c);
            fos.flush();
        }
        fis.close();
        fos.close();
    }
}
