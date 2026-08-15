import java.util.Scanner; 
 
public class MenuCalculator{ 
    int calculator(){ 
        Scanner input=new Scanner(System.in); 
 
 
        int choice; 
        int result=0; 
        int n1=0; 
        int n2=0; 
         
        do {  
 
            System.out.println("1- Addition"); 
            System.out.println("2- Subtraction"); 
            System.out.println("3- Multiplication"); 
            System.out.println("4- Division"); 
            System.out.println("0- Exit"); 
 
            System.out.println("Enter your choice: "); 
            choice=input.nextInt(); 
 
            if(choice>=1 && choice<=4){ 
                System.out.println("Enter Number 1: "); 
                n1=input.nextInt(); 
                System.out.println("Enter NUmber 2: "); 
                n2=input.nextInt(); 
 
                switch(choice){ 
                    case 1: 
                        result=n1+n2; 
                        System.out.println("Result: " + result + "\n"); 
                        break; 
                    case 2: 
                        result=n1-n2; 
                        System.out.println("Result: " + result + "\n"); 
                        break;    
                    case 3: 
                        result=n1*n2; 
                        System.out.println("Result: " + result + "\n"); 
                        break; 
                    case 4: 
                        if(n2==0) { 
                            System.out.println("Cannot divide by zero. \n"); 
                        } else { 
                            result=n1/n2; 
                            System.out.println("Result: " + result + "\n"); 
                        } 
                        break; 
                } 
            } else if(choice==0){ 
                System.out.println("Exiting! \n"); 
            } else { 
                System.out.println("Invalid Choice \n"); 
            } 
             
        }while (choice!=0); 
        return result; 
    } 
}