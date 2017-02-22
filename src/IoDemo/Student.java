package IoDemo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by lsq on 2/14/17.
 */
public class Student implements Serializable{
    private String stunum;
    private String stuname;
    private transient int stuage;

    public Student(){

    }
    public Student(String stunum,String stuname,int stuage){
        super();
        this.stunum=stunum;
        this.stuname=stuname;
        this.stuage=stuage;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    public String getStrname() {
        return stuname;
    }

    public void setStrname(String strname) {
        this.stuname = strname;
    }

    public int getStrage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stunum='" + stunum + '\'' +
                ", strname='" + stuname + '\'' +
                ", strage='" + stuage + '\'' +
                '}';
    }


    private void writeObject(java.io.ObjectOutputStream s)
        throws java.io.IOException{
        s.defaultWriteObject();//把jvm能默认序列化的元素进行序列化操作
        s.writeInt(stuage);//自己完成stuage的序列化
    }
    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();
        this.stuage=s.readInt();
    }
}
