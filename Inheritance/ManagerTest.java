public class ManagerTest {
    public static void main(String[] args) {
        Manager boss=new Manager("Mehran \t",100000.00,2024,04,01);
        boss.setBonus(5000);

        Employee [] staff = new Employee[4];

        staff[0]=boss;
        staff[1]=new Employee("Aadil \t " ,40000.00,2026,04,01);
        staff[2]=new Employee ("Zahid \t ",30000.00,2027,04,01);
        staff[3]=new Employee("Fozia \t ",20000.00,2028,04,01);

        for(Employee e : staff)

        System.out.println("Name = " + e.getName() + " Salary = " + e.getSalary() +" \t Date of joining = "+ e.getHireDay());
    }
}
