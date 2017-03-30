package equals;

import java.util.Objects;

/**
 * Created by liwenkui on 2017/3/24.
 */
public class Manager extends Employee
{
    private double bonus;

    public Manager(String name,double salary,int year , int month, int day)
    {
        super(name, salary, year, month, day);
        bonus = 0;
    }
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;

    }
    @Override public int hashCode()
    {
        //return super.hashCode() + 17 * Double.hashCode(bonus);
       return Objects.hash(super.hashCode(),bonus);
    }
    @Override public String toString()
    {
        return super.toString() + "[bonus="+bonus+"]";
    }
}
