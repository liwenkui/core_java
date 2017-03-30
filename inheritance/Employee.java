package inheritance;

import java.time.LocalDate;

/**
 * Created by liwenkui on 2017/3/23.
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year ,int month,int day)
    {
        this.name = name;
        this.salary = salary;
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
        double raise = salary * byPrecent / 100;
        salary += raise;
    }
}
