package packCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lsq on 12/21/16.
 */
public class ListTest {
    public List<Course> courseList;

    public ListTest() {
        this.courseList = new ArrayList();
    }

    public void testAdd() {
        Course course = new Course("1", "数据结构");
        courseList.add(course);
        Course temp = courseList.get(0);
        System.out.println("stored:" + temp.id + " " + temp.name);

        System.out.println(courseList);
        Course course1 = new Course("2", "C语言");
        courseList.add(0, course1);
        Course temp1 = courseList.get(0);
        System.out.println("ZeraAddress" + temp1.id + " " + temp1.name);

        System.out.println(courseList);
        Course course2 = new Course("3", "test");
        courseList.add(0, course2);
        Course temp2 = courseList.get(0);
        System.out.println(temp2.id + " " + temp2.name);
        System.out.println(courseList);


        Course[] courses={new Course("3","离散数学"),new Course("4","大学英语")};
        courseList.addAll(Arrays.asList(courses));
        Course temp3=courseList.get(3);
        Course temp4=courseList.get(4);
        System.out.println(temp3.id+" "+temp3.name+" "+temp4.id+" "+temp4.name);
        System.out.println(courseList);

        Course[] courses1={new Course("5","高等数学"),new Course("6","大学物理")};
        courseList.addAll(2,Arrays.asList(courses1));
        Course temp5=courseList.get(2);
        Course temp6=courseList.get(3);
        System.out.println(temp5.id+" "+temp5.name+" "+temp6.id+" "+temp6.name);
        System.out.println(courseList);
        System.out.println();
    }
    public void testGet(){
        int size=courseList.size();
        System.out.println("通过GET列出如下课程");
        for(int i=0;i<size;i++){
            Course cre=courseList.get(i);
            System.out.println("课程是："+cre.id+" "+cre.name);
        }
        System.out.println();
    }


    public void testIterator(){
        Iterator it=courseList.iterator();
        System.out.println("通过iterator列出如下课程");
        while(it.hasNext()){
            Course cr= (Course) it.next();
            System.out.println("课程是："+cr.id+" "+cr.name);
        }
        System.out.println();
    }

    public void testForEach(){
        System.out.println("通过foreach列出如下课程");
        for(Course obj:courseList){
            Course se=obj;
            System.out.println("课程是："+se.id+" "+se.name);
        }

    }

    public void testModify(){
        courseList.set(4,new Course("7","毛概"));
    }

    public void testRemove(){
        Course se=courseList.get(4);
        System.out.println("该位置课程是："+se.id+" "+se.name);
        courseList.remove(se);
        System.out.println("成功删除");
        testForEach();
    }

    public void testRemoveAll(){
        Course[] se={courseList.get(4),courseList.get(5)};
        courseList.removeAll(Arrays.asList(se));
        testForEach();
    }


    public static void main(String args[]) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testGet();
        lt.testIterator();
        lt.testForEach();
        lt.testModify();
        lt.testIterator();
        lt.testRemove();
        lt.testRemoveAll();
    }
}
