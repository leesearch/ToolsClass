package packCollection;

/**
 * Created by lsq on 12/28/16.
 */
public class Convert {

    public static byte[] intToByte(int id){
       byte[] arr=new byte[4];
        arr[0]=(byte) (int)(id>>0*8);
        arr[1]=(byte) (int)(id>>1*8);
        arr[2]=(byte) (int)(id>>2*8);
        arr[3]=(byte) (int)(id>>3*8);
        return arr;
    }

    public static int byteToInt(byte[] arr){
//        int rs0=(int) ((arr[0] & 0xff)<<0*8);
//        int rs1=(int) ((arr[1] & 0xff)<<1*8);
//        int rs2=(int) ((arr[2] & 0xff)<<2*8);
//        int rs3=(int) ((arr[3] & 0xff)<<3*8);
//        return rs0+rs1+rs2+rs3;
        int result=0;
        for(int i=0;i<arr.length;i++){
            result+=(int) ((arr[i] & 0xff)<<i*8);
        }
        return result;
    }

    public static void main(String args[]){
        Convert ct=new Convert();
        byte[] arr=ct.intToByte(8143);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
        System.out.println(ct.byteToInt(arr));

        String describe="我每天都练功，我天下无敌";
        byte[] des=describe.getBytes();

        String str=new String(des);
        System.out.println(str);
    }
}
