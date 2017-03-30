import com.horstmann.corejava.*;
/**
 * Created by liwenkui on 2017/3/22.
 */
import static java.lang.System.*;
public class PakageTest {
    public static void main(String [] args)
    {
        Employee harry = new Employee("Harry Hacker",50000,1989,10,1);
        harry.raiseSalary(5);
        out.println("name="+harry.getName()+",salary="+harry.getSalary());
    }
}
