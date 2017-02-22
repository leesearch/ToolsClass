package IoDemo;

import java.io.*;

/**
 * Created by lsq on 2/15/17.
 */
public class ObjectSeriaDemo2 {
    public static void main(String args[])throws Exception{
        //当子类对象进行反序列化操作时，如果其父类没有实现序列化接口时，那么其父类的构造函数会被显示调用。
        /*ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("/home/lsq/javaio/obj1.dat"));
        Bar2 bar2=new Bar2();
        oos.writeObject(bar2);
        oos.flush();
        oos.close();
*/
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("/home/lsq/javaio/obj1.dat"));
        Bar2 bar2=(Bar2)ois.readObject();
        System.out.println(bar2);
        ois.close();
    }

}
class Foo implements Serializable{
    public Foo(){
        System.out.println("Foo");
    }
}
class Foo1 extends Foo{
    public Foo1(){
        System.out.println("Foo1");
    }
}
class Foo2 extends Foo1{
    public Foo2(){
        System.out.println("Foo2");
    }
}

class Bar{
    public Bar(){
        System.out.println("Bar");
    }
}
class Bar1 extends Bar implements Serializable{
    public Bar1(){
        System.out.println("Bar1");
    }
}
class Bar2 extends Bar1{
    public Bar2(){
        System.out.println("Bar2");
    }
}