import java.util.*; 

public class grade {
    int result;
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your Mark ");  
        int a = sc.nextInt();
        System.out.print("Grade :");
        if(a<25){
            System.out.println("F");

        }
        else if(a>=25&&a<45) {
            System.out.println("E");
        }
        else if( a>= 45 && a <50) {
            System.out.println("D");
        }
        else if( a >= 50 && a < 60) {
            System.out.println("C");
        }
        else if( a >= 60 && a <80) {
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
        sc.close();
    }
}