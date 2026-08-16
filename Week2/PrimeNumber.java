import java.util.Scanner; 
 
public class PrimeNumber{ 
    public void isPrimeNumber(){ 
        Scanner scan=new Scanner(System.in); 
        System.out.print("Enter num :  "); 
        int num=scan.nextInt(); 
         
        while(num<2) 
        { 
            System.out.println("Enter a number greater than or equal to 2: "); 
            num=scan.nextInt(); 
        } 
 
        int count=0; 
 
        for(int i=2; i*i<=num; i++)  
        { 
            if(num%i==0) 
            { 
                count++; 
            } 
        } 
 
        if(count==0) 
            System.out.println(num + " is prime"); 
        else 
            System.out.println(num + " is not prime"); 
    } 
}