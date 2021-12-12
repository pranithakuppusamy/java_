import java.util.*;
public class duplicate {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER ARRAY INDEX"); 
        int n=sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("ENTER THE ARRAY"); 
        for(int i=0;i<n;i++){
          arr [i] = sc.nextInt();
        }
        sc.close();
        System.out.println("DUPLICATE NUMBERS"); 
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
          }
         }
        }