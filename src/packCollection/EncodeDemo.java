package packCollection;

import java.io.UnsupportedEncodingException;

/**
 * Created by lsq on 12/29/16.
 */
public class EncodeDemo {
    public static void main(String args[]) throws UnsupportedEncodingException {
        String str="慕课ABC";


        byte[] bytes1=str.getBytes();
        for(byte b:bytes1){
            System.out.print(Integer.toHexString(b)+" ");
        }

        System.out.println();
        byte[] bytes2=str.getBytes("gbk");
        for(byte b:bytes2){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }

        System.out.println();
        byte[] byte2=str.getBytes("utf-8");
        for(byte b:byte2){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();

        byte[] byte3=str.getBytes("utf-16be");
        for(byte b:byte3){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();

        String str1=new String(byte3,"utf-16be");
        System.out.println(str1);
    }
}
