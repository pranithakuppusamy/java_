import java.util.*;
public class primewithlimits {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
         int n =s.nextInt();
         s.close();
         int a=0;
         for(int i=0;i<n;i++){
            if(i%2==0){
                a +=i;
            }
         }
         System.out.println("SUM OF PRIME NUMBERS UNDER "+n+" IS");
         System.out.println(a);
    }
    
}