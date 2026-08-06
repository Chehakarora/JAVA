import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=input.nextInt();

        System.out.print("Enter second number: ");
        int num2=input.nextInt();

        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Quotient");
        System.out.println("5. Remainder");

        System.out.print("Enter your choice: ");
        int choice=input.nextInt();

        if(choice==1)
            System.out.println("Sum = "+(num1+num2));
        else if(choice==2)
            System.out.println("Difference = "+(num1-num2));
        else if(choice==3)
            System.out.println("Product = "+(num1*num2));
        else if(choice==4)
            System.out.println("Quotient = "+(num1/num2));
        else if(choice==5)
            System.out.println("Remainder = "+(num1%num2));
        else
            System.out.println("Invalid Choice");

        input.close();
    }
}