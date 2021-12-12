import java.util.*;

public class absolute {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the index value");
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("enter the values");
        for(int i=0;i<n;i++){
            arr [i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The result is");
        for(int j=0;j<n;j++){
            if(arr[j]<0){
                arr[j]=-(arr[j]);
                System.out.println(arr[j]);
            }
            else{
                System.out.println(arr[j]);
            }
            
        }
    }
    
}        
