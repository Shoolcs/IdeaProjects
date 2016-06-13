/**
 * Created by Lenovo on 09.06.2016.
 */
import java.lang.*;
public class InfiniteNan {
    public static void main(String[] args) {
        Double d1 = new Double(1/0.);
        Double d2 = new Double(0/0.);
        System.out.println(d1.isInfinite() + "   " + d1.isNaN());
        System.out.println(d2.isInfinite() + "  " + d2.isNaN());
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try{
            p = r.exec("notepad");
            p.waitFor();


        }
        catch (Exception e ){
            System.out.println("Ошибка віполнения notepad.");

        }
        System.out.println("Notepad  завершился" + p.exitValue());
        long start , end ;
        start = System.currentTimeMillis();
        for(int i = 0 ; i<11000000 ; i++){}
            end = System.currentTimeMillis();

        System.out.println("RunTime"+ (end-start));
        System.out.println(System.getProperties());
    }
}

