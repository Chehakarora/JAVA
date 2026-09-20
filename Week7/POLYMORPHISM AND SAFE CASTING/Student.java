class Student extends Person{

    private int rollno;
    private int course;
    
    @Override
    void displayName() {
        System.out.println("Function 1 from Student");
        System.out.println("Student Name: " + name);
    }

    @Override
    void displayAge()
    {
        System.out.println("Function 2 from Student");
        System.out.println("Student Age: " + age);
    }

    void displayStudentDetails()
    {
        System.out.println("Function 3 from Student");
        System.out.println("Roll No: "+rollno);
        System.out.println("Course: "+course);
    }

}