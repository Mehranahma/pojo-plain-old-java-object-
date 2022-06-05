public class Employee {
     private String name;
     private double salary;
     private int id;
     static int nextid;
     public Employee( String n, double s){
         name = n;
         salary = s;

     }
     public String getName(){
         return name;
     }
     public double getSalary(){
         return salary;
     }
     public int getId(){
         return id;
     }
     public static int getNextid(){
         return nextid;
     }
     public void setId(){
         id = nextid;
         nextid++;

     }


}

