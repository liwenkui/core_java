package inheritance;

/**
 * Created by liwenkui on 2017/3/23.
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name,double salary,int year,int month,int day)
    {
        super(name,salary,year,month,day);
        bonus = 0;
    }
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary;
    }
    public void setBonus(double b)
    {
        bonus = b;
    }
}
