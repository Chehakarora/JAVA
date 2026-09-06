public class CampusManagementApp
{
}

class Person
{
    String name;

    Person(String name)
    {
        this.name=name;
    }

    void showInfo()
    {
        System.out.println("Person: "+name);
    }
}

class Student extends Person
{
    int id;

    Student(String name,int id)
    {
        super(name);
        this.id=id;
    }

    void showInfo()
    {
        System.out.println("Student: "+name+", ID: "+id);
    }
}

class Professor extends Person
{
    String dept;

    Professor(String name,String dept)
    {
        super(name);
        this.dept=dept;
    }

    void showInfo()
    {
        System.out.println("Prof: "+name+", Dept: "+dept);
    }
}

class CampusRegistry
{
    private Person[] list=new Person[5];
    private int count=0;

    void add(Person p)
    {
        if(count<list.length)
            list[count++]=p;
    }

    void process()
    {
        for(int i=0;i<count;i++)
            list[i].showInfo();
    }
}