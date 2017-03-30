package equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by liwenkui on 2017/3/24.
 */
public class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }
    public void raiseSalary(double byPrecent)
    {
        double raise = this.salary * byPrecent / 100;
        this.salary += raise;
    }
    @Override public boolean equals(Object otherObject)
    {
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        return Objects.equals(name,other.name) && salary == other.salary
                && Objects.equals(hireDay,other.hireDay);
    }

    @Override public int hashCode()
    {
        return Objects.hash(name,salary,hireDay);
    }

    @Override public String toString()
    {
        return getClass().getName()+"[name="+name+",salary="+salary+
                ",hireDay"+hireDay+"]";
    }
}
