import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length= input.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth= input.nextInt();

        System.out.print("Area of rectangle: " + (length*breadth));
        System.out.print("Perimeter of rectangle: " + (2*(length+breadth)));

        input.close();
    }
}