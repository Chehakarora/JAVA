import java.util.Scanner;

public class GreatestCommonDivisor
{
    Scanner scan=new Scanner(System.in);
    public void gcd()
    {
        System.out.print("Enter first number: ");
        int num1=scan.nextInt();
        System.out.print("enter second number: ");
        int num2=scan.nextInt();
        num1=Math.abs(num1);
        num2=Math.abs(num2);

        while(num2!=0) {
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }

        System.out.println("Greatest common divisor is: "+num1);
    }
}