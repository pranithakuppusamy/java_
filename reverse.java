import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE DIGIT");
        int number = s.nextInt();
        s.close();
        int  reverse = 0;  
        while(number != 0)   
        {  
        int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
        number = number/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse);  
        }
}
