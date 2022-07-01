import java.time.*;
public class Employee extends person{
    private double salary;
    private LocalDate hireDay;

    private String Department;

    public Employee(String name,double salary,int year,int month,int day,String department)
    {
        super(name);
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
        this.Department=department;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
   public  String getDescription()
   {
       return "an Employees in department "+Department;
   }

}
