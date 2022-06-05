public class EmployeeTest {
    public static void main(String[] args) {
        Employee obj[]=new Employee[4];
        obj[0]=new Employee("Mehran",2000);
        obj[1]=new Employee("Rizwan",3000);
        obj[2]=new Employee("Aadil",4000);

        for(Employee e : obj)
        {
            e.setId();
            System.out.println("Name  \t" + e.getName() + "Salary \t" + e.getSalary() + "ID  \t" + e.getId());
        }
    }
}
