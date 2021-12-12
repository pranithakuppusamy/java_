import java.util.*;
public class prime {
   
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
         int n =s.nextInt();
         boolean f =false;
         for(int i=2;i<=n/2;++i){
             if(n%i==0){
                 f=true;
                 break;
             }
         } 
         if(!f)
         System.out.println(n +" "+"IS A PRIME NUMBER");
         else
         System.out.println(n+" "+"IS NOT A PRIME NUMBER");
    }
}