import javax.naming.Name;

public class personTest {
    public static void main(String[] args) {
        person [] obj=new person[2];

        obj [0]=new Employee("Mehran",100000,2025,01,01,"Computer Science");
        obj [1]=new Student("Aadil","Software engineering");

        for (person p : obj)
            System.out.println("Name \t" +p.getName()+ " ," +p.getDescription());

    }
}
