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

    public static void main(String args[]) {
        CollectionsTest ct=new CollectionsTest();
//        ct.testSort1();
        ct.testSortString();
    }
}
