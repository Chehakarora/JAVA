public class Main {
    public static void main(String[] args) {
        Person P= new Person();   // Person P= new Student();   
        P.displayName();          // P.displayName();
        P.displayAge();           // P.displayAge(); 
        if(P instanceof Student)  // Student s= (Student)P;
        {                         // s.displayStudentDetails();
        Student s = (Student)P;
        s.displayStudentDetails();

        }
        else
        {
            System.out.println("Invalid object");
        }
    }
}