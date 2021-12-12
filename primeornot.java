import java.util.*;
public class primeornot {
   
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n =s.nextInt();
        s.close();
        int x=0;
        for(int i=3;i<10;i++){
            if(n==2){
                System.out.println("Given Number is a Prime Number ");
                break;
            }
            else if(i==n){
                continue;
            }
            else if (n%2==0){
                System.out.println("Given Number is not Prime Number ");
                break;
            }
            else if(n%i==0){
                System.out.println("Given Number is not Prime Number== ");
                break;
            }
            else{
                x++;
            }
        }
        if(x!=0){
            System.out.println("Given Number is a Prime Number ");
        }
    }
}
