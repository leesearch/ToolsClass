package packCollection;

import java.util.*;

/**
 * Created by lsq on 12/25/16.
 */
public class CollectionsTest {

    public void testSort1() {
        List<Integer> integers = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for (int i=0;i<10;i++) {
            do {
                k = random.nextInt(100);
            } while (integers.contains(k));
            integers.add(k);
            System.out.println("成功添加随机数："+k);
        }
        System.out.println("--------------排序前--------------");
        for (Integer inte:integers) {
            System.out.println("元素："+inte);
        }
        Collections.sort(integers);
        for (Integer sortAfter:integers) {
            System.out.println("now:"+sortAfter);
        }
    }

    public void testSortString(){
        List<String> stringList=new ArrayList<String>();
        stringList.add("李华");
        stringList.add("小明");
        stringList.add("小红");
        System.out.println("------------排序前-----------");
        for (String s:stringList) {
            System.out.println("sortBefore"+s);
        }
        Collections.sort(stringList);
        System.out.println("----------------排序后-------------");
        for (String after:stringList) {
            System.out.println("sortAfter:"+after);
        }
    }

    public void testSortString2(){
        List<String> string2List=new ArrayList<String>();
        Random random=new Random();
        Integer k;
        String str= "zxcvbnmlkjhgfdsaqwertyuiopZXCVBNMKLJHGFDSAQWERTYUIOP0987654321";
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<10;i++){
            do{
               int number=random.nextInt(10);

            }while(string2List.contains(str));
            string2List.add(str);
            System.out.println("成功添加整数字符串"+str);
        }
        System.out.println("--------排序前---------");
        for (String sortBefore:string2List) {
            System.out.println(" 序列元素:"+sortBefore);
        }
        Collections.sort(string2List);
        for (String sortAfter:string2List) {
            System.out.println("element:"+sortAfter);
        }
    }

    public static void main(String args[]) {
        CollectionsTest ct=new CollectionsTest();
//        ct.testSort1();
//        ct.testSortString();
        ct.testSortString2();
    }
}
