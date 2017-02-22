package IoDemo;

import java.io.*;

/**
 * Created by lsq on 2/14/17.
 */
public class BrAndBwDemo {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("/home/lsq/javaio/fWrite.txt")));
//        BufferedWriter bw=new BufferedWriter(
//                new OutputStreamWriter(
//                        new FileOutputStream("/home/lsq/javaio/imooc3.txt")));
        PrintWriter pw=new PrintWriter("/home/lsq/javaio/imooc4.txt");
        String line;
        while((line=br.readLine())!=null){
            System.out.print(line);
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
            pw.println(line);
            pw.flush();
        }
        br.close();
//        bw.close();
        pw.close();
    }
}
