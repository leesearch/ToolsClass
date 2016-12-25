package Time;

/**
 * Created by lsq on 12/21/16.
 */
public class ClassMath {
    public static void main(String args[]){
        double a=12.81;
        int b=(int) a;
        System.out.println("purposeTurn:"+b);
        long c=Math.round(a);
        System.out.println("fourCutFiveahead:"+c);
        double d=Math.floor(a);
        System.out.println("the max of lessThanA:"+d);
        double e=Math.ceil(a);
        System.out.println("the min of greatThanA:"+e);
        double x= Math.random();
        System.out.println("greatThanZeroAndLessThanONE:"+x);
        int y=(int) (Math.random()*99);
        System.out.println(y);
    }
}
