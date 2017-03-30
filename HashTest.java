import java.util.Arrays;

/**
 * Created by liwenkui on 2017/3/24.
 */
public class HashTest {
    public static void main(String [] args)
    {
        String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode()+" "+sb.hashCode());
        String t = new String("Ok");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode()+" "+tb.hashCode());
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        System.out.println("a_hash="+Arrays.hashCode(a)+"b_hash"+Arrays.hashCode(b));
        int [] luckyNumbers = {2,3,5,7,11,13};
        String ss = ""+luckyNumbers.toString();
        System.out.println(ss+" "+Arrays.toString(luckyNumbers));
    }
}
