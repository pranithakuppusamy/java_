import java.util.*;
public class reversed {
   
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] arr;
        System.out.println("ENTER HOW MANY DIGITS");
        int n = s.nextInt();
        arr=new int[n];
        System.out.println("ENTER EACH DIGIT WITH A TAB");
        for(int i=0;i<n;i++){
            arr [i] = s.nextInt();
        }
        int j=n-1;
        System.out.println("THE REVERSED VALUES ARE");
        for(;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
