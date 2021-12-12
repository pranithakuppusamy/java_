import java.util.*;
public class maxmin {
    public static void main(String args[]){
        int temp=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER ARRAY INDEX"); 
        int n=sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("ENTER THE ARRAY"); 
        for(int i=0;i<n;i++){
          arr [i] = sc.nextInt();}
           //Sort the array in ascending order    
           for (int i = 0; i < n; i++) {     
               for (int j = i+1; j < n; j++) {     
                  if(arr[i] > arr[j]) {    
                      temp = arr[i];    
                      arr[i] = arr[j];    
                      arr[j] = temp;  } } }  
           //Displaying elements of array after sorting       
           for (int i = 0; i < n; i++) { 
               if(i==(n-1))
                System.out.println("Max="+arr[n-1]);
               } System.out.println("Min="+arr[0]);}}  