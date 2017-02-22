package IoDemo;

/**
 * Created by lsq on 1/1/17.
 */
public class EncodeDemo {
    public static void main(String args[])throws Exception{
        String s="慕课ABC";

        //系统默认 utf-8编码方式
        byte[] bytes=s.getBytes();
        for(byte b:bytes){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();

        byte[] bytes1=s.getBytes("gbk");
        for(byte b:bytes1){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();

        byte[] bytes2=s.getBytes("utf-8");
        for(byte b:bytes2){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();

        byte[] bytes3=s.getBytes("utf-16be");
        for(byte b:bytes3){
            System.out.print(Integer.toHexString(b & 0xff)+" ");
        }
        System.out.println();

        String str=new String(bytes1,"gbk");
        System.out.println(str);
    }
}
