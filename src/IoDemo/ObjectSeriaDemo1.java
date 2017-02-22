package IoDemo;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;

/**
 * Created by lsq on 2/14/17.
 */
public class ObjectSeriaDemo1 {
    public static void main(String args[])throws Exception{
        String file="/home/lsq/javaio/imooc6.dat";
        /*ObjectOutputStream oot=new ObjectOutputStream(new FileOutputStream(file));
        Student stu=new Student("12","张三",20);
        oot.writeObject(stu);
        oot.flush();
        oot.close();*/

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        Student stu=(Student)ois.readObject();
        System.out.println(stu);
        ois.close();
    }
}
