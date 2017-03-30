import java.text.NumberFormat;

/**
 * Created by liwenkui on 2017/3/22.
 */
public class NumberF {
    public static void main(String [] args)
    {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x =0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
    }
}
