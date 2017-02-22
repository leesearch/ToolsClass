package IoDemo;

import java.io.*;

/**
 * Created by lsq on 1/4/17.
 */
public class charStreamIN {
    public static void main(String args[])throws IOException{
        FileInputStream in=new FileInputStream("/home/lsq/javaio/curtain.txt");
        InputStreamReader isr=new InputStreamReader(in,"utf-8");
//        int c;
//        while((c=isr.read()) != -1){
//            System.out.print((char)c);
//        }
        /*char[] buffer=new char[8 * 1024];
        int c;
        while((c=isr.read(buffer,0,buffer.length))!=-1){
            String s=new String(buffer,0,c);
            System.out.print(s);
        }*/
        FileOutputStream fos=new FileOutputStream("/home/lsq/javaio/curtainUTF.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        char[] buffer=new char[8 * 1024];
        int c;
        while((c=isr.read(buffer,0,buffer.length)) != -1){
            String s=new String(buffer,0,c);
            System.out.print(s);
            osw.write(buffer,0,c);
            osw.flush();
        }
        isr.close();
        osw.close();
    }
}
