import java.util.Scanner;

public class GradingSystem {

    String classifyMark(){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter marks: ");
        int mark=input.nextInt();

        if(mark==100||mark>=80){
            return "Distinction";
        }
        else if(mark==79||mark>=70){
            return "Merit";
        }
        else if(mark==69||mark>=50){
            return "Pass";
        }
        else if(mark==49||mark>=0){
            return "Fail";
        }
        else{
            return "Invalid Marks";
        }
        
    }
}

    