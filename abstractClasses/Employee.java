package abstractClasses;

import java.time.LocalDate;

/**
 * Created by liwenkui on 2017/3/23.
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }
    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }
}
