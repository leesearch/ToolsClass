package packCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lsq on 12/23/16.
 */
public class MapTest {

    public Map<String,Students> students;
    public MapTest(){
        this.students=new HashMap<String,Students>();
    }

    public void testPut(){
        Scanner console=new Scanner(System.in);
        int i=0;
        while(i<3){
            System.out.println("请输入学生ID");
            String ID=console.next();
            Students st=students.get(ID);
            if(st==null){
                System.out.println("请输入学生姓名");
                String name=console.next();
                Students newStudents=new Students(ID,name);
                students.put(ID,newStudents);
                System.out.println("成功添加学生："+students.get(ID).name);
                i++;
            }else{
                System.out.println("该学生已注册，请重新输入");
                continue;
            }
        }
    }

    public void testKeySet(){
        Set<String> keySet=students.keySet();
        System.out.println("总共有"+students.size()+"个学生");
        for (String ss:keySet) {
            Students stu=students.get(ss);
            if(stu!=null){
                System.out.println("该名同学是："+stu.name);
            }
        }
    }

    public void testRemove(){
        Scanner console=new Scanner(System.in);
        while(true){
            System.out.println("请输入需要删除的学生ID");
            String ID=console.next();
            Students students1=students.get(ID);
            if(students1==null){
                System.out.println("该ID不存在");
                continue;
            }
            students.remove(ID);
            System.out.println("已成功删除学生"+students1.name);
            break;
        }
    }

    public void testEntry(){
        Set<Map.Entry<String,Students>> entrySet=students.entrySet();
        for (Map.Entry<String,Students> entry:entrySet) {
            System.out.println("学生的ID："+entry.getKey());
            System.out.println("学生的姓名："+entry.getValue().name);
        }
    }

    public void testModify(){
        System.out.println("请输入需要修改的学生ID");
        Scanner console=new Scanner(System.in);
        while(true){
            String stuID=console.next();
            Students stu=students.get(stuID);
            if(stu==null){
                System.out.println("该ID无效");
                continue;
            }
            System.out.println("将要修改的学生姓名为："+stu.name);
            System.out.println("将要被修改为:");
            String name=console.next();
            Students newStudent=new Students(stuID,name);
            students.put(stuID,newStudent);
            System.out.println("修改成功");
            break;
        }
    }

    public void testMapContainsKeyOrValue(){
        System.out.println("请输入要查询的学生ID：");
        Scanner console=new Scanner(System.in);
        String id=console.next();
        System.out.println("您输入的学生ID"+id+"在学生映射表中是否存在"+students.containsKey(id));
        if(students.containsKey(id)){
            System.out.println("查询到学生"+students.get(id).name+"存在");
        }
        System.out.println("请输入要查询的学生姓名：");
        String name=console.next();
        if(students.containsValue(new Students(null,name))){
            System.out.println("您查询的学生姓名"+name+"确实存在");
        }else{
            System.out.println("学生映射表中不存在该学生");
        }
    }

    public static void main(String args[]){
        MapTest mt=new MapTest();
        mt.testPut();
        mt.testKeySet();
//        mt.testRemove();
//        mt.testEntry();
//        mt.testModify();
//        mt.testEntry();
        mt.testMapContainsKeyOrValue();
    }
}
