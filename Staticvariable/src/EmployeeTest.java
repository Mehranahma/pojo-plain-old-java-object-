import javax.naming.Name;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee obj[]=new Employee[4];

        Employee obj[0]=new Employee("Mehran" ,4000);
        Employee obj[1]=new Employee ("fozia",5000);
        Employee obj[2]=new Employee("Aadil",6000);
        Employee obj[3]=new Employee ("Rizwan",7000);

        for(Employee e: obj)
            e.setid()
            System.out.println("Name" + e.getname() +"salary"+ e.getsalary() +"ID"+ e.getid());


