import java.util.Scanner;

public class LoopPatterns
{
    Scanner scan=new Scanner(System.in);
    public void DrawLoop()
    {
        System.out.println("enter a number for pattern");
        int num=scan.nextInt();

        while(num<1)
        {
            System.out.println("Invalid number. Enter again:");
            num=scan.nextInt();
        }

        System.out.println("Pattern 1");
        patternA(num);

        System.out.println("Pattern 2");
        patternB(num);

        System.out.println("Pattern 3");
        patternC(num);

        System.out.println("Pattern 4");
        patternD(num);

        System.out.println("Pattern 5");
        patternE(num);
    }

    public void patternA(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void patternB(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void patternC(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void patternD(int num)
    {
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void patternE(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}