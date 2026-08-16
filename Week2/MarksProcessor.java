import java.util.Scanner; 
public class MarksProcessor  
{ 
    Scanner scan = new Scanner(System.in); 
    public void IsValidMarks() 
    { 
        int marks = 0, count = 0 ,sum = 0 ,highest = -1, pass = 0 ,fail = 0; 
        double average = 0; 
        
        while (marks != -1)  
            { 
                System.out.println("Enter marks: "); 
                marks = scan.nextInt(); 
                
                if (marks != -1) 
                { 
                    if (marks >= 0 && marks <= 100) 
                    { 
                        count++; 
                        sum += marks; 
                        
                        if (marks > highest)  
                            { 
                                highest = marks; 
                            } 
                            
                        if (marks >= 50) 
                        { 
                            pass += 1; 
                        } 
                        else 
                        { 
                            fail += 1; 
                        } 
                    } 
                    else 
                    { 
                        System.out.println("Invalid marks. Enter marks between 0 and 100."); 
                    } 
                } 
            } 
            
            if (count > 0) 
                    { 
                        average = (double)sum / count; 
                    } 
 
            System.out.println("Count = " + count ); 
            System.out.println("Highest marks = " + highest ); 
            System.out.println("No of Passed Subject = " + pass ); 
            System.out.println("No of Failed Subject = " + fail ); 
            System.out.println("Average Marks = " + average ); 
            System.out.println("Sum = " + sum); 
    } 
}