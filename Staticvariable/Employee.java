public class Employee {
    double salary;
    String name ;
    int id;
    static int nextid;

    public Employee(double n,string s)
    {
        name=n;
        salary=s;
        id=0;
    }
    public String getname ()
    {
        return name;
    }
   pubic double getsalary() {
        return salary;
    }
    public int void getid()
    {
        return id;
    }

    public void setId()
    {
        id=nextid;
        nextid++;
    }




}
