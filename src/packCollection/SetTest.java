package packCollection;

import java.util.*;

/**
 * Created by lsq on 12/23/16.
 */
public class SetTest {
    public List<Course> courseList;
    private Scanner console;
    public Students stu;

    public SetTest() {
        courseList = new ArrayList<Course>();
        console = new Scanner(System.in);
    }

    public void testAdd() {
        Course course = new Course("1", "数据结构");
        courseList.add(course);

        System.out.println(courseList);
        Course course1 = new Course("2", "C语言");
        courseList.add(0, course1);

        System.out.println(courseList);
        Course course2 = new Course("3", "test");
        courseList.add(0, course2);

        Course[] courses = {new Course("3", "离散数学"), new Course("4", "大学英语")};
        courseList.addAll(Arrays.asList(courses));

        Course[] courses1 = {new Course("5", "高等数学"), new Course("6", "大学物理")};
        courseList.addAll(2, Arrays.asList(courses1));
    }

    public void testForEach() {
        System.out.println("通过foreach列出如下课程");
        for (Course obj : courseList) {
            Course se = obj;
            System.out.println("课程是：" + se.id + " " + se.name);
        }
    }

    public void testListContian() {
        System.out.println("取得备选课程的第零个元素");
        Course course = courseList.get(0);
        System.out.println("取得课程" + course.name);
        System.out.println("备选课程里是否包含课程：" + course.name + courseList.contains(course));
        System.out.println("请输入名称：");
        String name = console.next();
        Course course1 = new Course();
        course1.name = name;
        System.out.println("新增课程:" + course1.name + "是否包含新增课程:" + courseList.contains(course1));
        if(courseList.contains(course1)){
            System.out.println("课程"+course1.name+"的索引位置为"+courseList.indexOf(course1));
        }

    }

    public void createStudentAddSelectCourse() {
        stu = new Students("1", "小明");
        System.out.println("欢迎学生" + stu.name + "选课");
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入需要选择的课程：");
            String courseid = console.next();
            for (Course cr : courseList) {
                if (cr.id.equals(courseid)) {
                    stu.course.add(cr);
                }
            }
        }
        for (Course cr : stu.course) {
            System.out.println("学生选择了课程：" + cr.id + " " + cr.name);
        }
    }

    public void testSetContains(){
        System.out.println("请输入课程名称：");
        String name=console.next();
        Course course1 = new Course();
        course1.name = name;
        System.out.println("新增课程:" + course1.name + "是否包含新增课程:" + stu.course.contains(course1));

    }


    public static void main(String args[]) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testListContian();
        st.testForEach();
//        st.createStudentAddSelectCourse();
//        st.testSetContains();
//        Students stu=new Students("1","小明");
//        System.out.println("欢迎学生"+stu.name+"选课");
//        Scanner console=new Scanner(System.in);
//        for(int i=0;i<3;i++){
//            System.out.println("请输入需要选择的课程：");
//            String courseid=console.next();
//            for(Course cr:st.courseList){
//                if(cr.id.equals(courseid)){
//                    stu.course.add(cr);
//                }
//            }
//
//        }
//        for (Course cr:stu.course) {
//            System.out.println("学生选择了课程："+cr.id+" "+cr.name);
//        }
//    }
    }


}
