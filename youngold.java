import java.util.*;

public class youngold{
    public static void main(String args[]){
        int temp=0;
        int[] arr;
        arr = new int[3];
        int[] a;
        a = new int[3];
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter AGE"); 
        for(int i=0;i<3;i++){
          arr [i] = sc.nextInt();
        }
        sc.close();
        System.out.println("THE RESULT IS");
           //Sort the array in ascending order    
           for (int i = 0; i < arr.length; i++) {     
               for (int j = i+1; j < arr.length; j++) {     
                  if(arr[i] > arr[j]) {    
                      temp = arr[i];    
                      arr[i] = arr[j];    
                      arr[j] = temp;    
                  }     
               }     
           }    
             
           System.out.println();    
               
           //Displaying elements of array after sorting    
           System.out.println("AGE IN ORDER: ");    
           for (int i = 0; i < arr.length; i++) { 
               if(i==1){
                continue;
               }
               if(i==0){
                System.out.println(arr[0]+" "+"is the youngest");
               }
               if(i==2){
                System.out.println(arr[2]+" "+"is the oldest");
               }
            }  
           }    
         
       }