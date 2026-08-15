import java.util.Scanner;

public class LeapYear {
    boolean isLeapYear(){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year=input.nextInt();

        if(year%400==0 || (year%4==0&&year%100!=0)){
            return true;
        }
        else{
            return false;
        }


    }
    
}


