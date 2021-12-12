import java.util.*;
public class fibinocci{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE LIMIT");
         int n =s.nextInt();
         int a=0;
         int b=1;
         int c=0;
         System.out.println("The Fibonacci Series is");
         for(int i=0;i<n;i++){
            System.out.print("\t"+c);
             c=a+b;
             b=a;
             a=c;
         }
    }
}

