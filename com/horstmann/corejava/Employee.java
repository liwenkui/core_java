package  com.horstmann.corejava;

import java.time.LocalDate;

/**
 * Created by liwenkui on 2017/3/22.
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }
    public void raiseSalary(double byPrecent) {
        double raise = this.salary * byPrecent / 100;
        this.salary += raise;
    }
}
