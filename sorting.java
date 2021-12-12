import java.util.*;
public class sorting {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER THE INDEX NUMBER:"); 
        int n=sc.nextInt();
        int temp=0;
        int[] arr;
        arr = new int[n];
        System.out.println("Enter NUMBERS TO BE SORTED:"); 
        for(int i=0;i<n;i++){
          arr [i] = sc.nextInt();
        }
        System.out.println("THE ASCENDING ORDER IS");
           //Sort the array in ascending order    
           for (int i = 0; i < n; i++) {     
               for (int j = i+1; j < n; j++) {     
                  if(arr[i] > arr[j]) {    
                      temp = arr[i];    
                      arr[i] = arr[j];    
                      arr[j] = temp;    
                  }}}  
           for(int k=0;k<n;k++){
            System.out.print("\t"+arr[k]); 
           }  
           System.out.println("\n"+"THE DECENDING ORDER IS");
           for(int k=n-1;k>=0;k--){
            System.out.print("\t"+arr[k]); 
           } }}
