import java.util.*;
    // Java program to find factorial of given number
public class factorial
{
	// method to find factorial of given number
		public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);
      System.out.println("Enter The Factorial number");
      int n= s.nextInt();
      int a ;
      a=1;
      if (n == 0){
        System.out.println(" Factorial of this number is 1");
     }
      for(int i=1;i<=n;i++){
          a=a*i;
      }
      System.out.println("Factorial of "+ n +" is: "+ a); 
          
      }}