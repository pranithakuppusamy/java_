import java.util.Scanner;
public class placeofwork {
    public static void main(String[] args) 
    {
        int x;
        String y,z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        x = s.nextInt();
        System.out.print("Enter Your Sex (M/F):");
        y = s.next();
        System.out.print("Enter Your Maritial Status(Y/N):");
        z = s.next();
        System.out.println("Place of service");
        s.close();
        if(y.equals("M"))
        {
           
             
            if(x>=20&&x<40){
                System.out.println("Work in Anywhere");
              }
             else if(x>=40&&x<60){
                 System.out.println("Work in Urban areas only--");
               }
            else{
                System.out.println("ERROR");
               }
         }
        else
        {
            System.out.println("Work in Urban areas Only");

        }
 
    }
}
