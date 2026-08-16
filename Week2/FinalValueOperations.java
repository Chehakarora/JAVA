import java.util.Scanner;

public class FinalValueOperations
{
    Scanner scan=new Scanner(System.in);

    public void finalValue()
    {
        System.out.println("Enter number of operations: ");
        int n=scan.nextInt();

        int x=0;

        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter operation: ");
            String operation=scan.next();

            if(operation.contains("+"))
            {
                x++;
            }
            else
            {
                x--;
            }
        }

        System.out.println("Final value of X = " +x);
    }
}