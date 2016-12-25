package packCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsq on 12/23/16.
 */
public class TestGenaric {
    public List<Course> course;
    public TestGenaric(){
        this.course=new ArrayList<Course>();
    }

    public void testAdd(){
        Course cr1=new Course("1","大学语文");
        course.add(cr1);
        Course cr2=new Course("2","线性代数");
        course.add(cr2);
    }

    public void testForEach(){
        for(Course obj:course){
            Course our=obj;
            System.out.println("课程是"+our);
        }
    }

    public static void main(String args[]){
        TestGenaric tg=new TestGenaric();
        tg.testAdd();
        tg.testForEach();
    }


}
