import java.util.Scanner;
public class norepeat{
       public static void main(String[] args) 
       {
          Scanner sc=new Scanner(System.in);
          int[] a=new int[50];
          System.out.println("ENTER INDEX NUMBER");
          int size=sc.nextInt();
          System.out.println("ENTER ELEMENTS OF AN ARRAY");
          for(int i=0;i<size;i++)
               a[i]=sc.nextInt();
          int count;
          sc.close();
          System.out.println("NON REPEATING ELEMENTS ARE");
         for(int i=0;i<size;i++) {
             count=0;
             for (int j = 0; j < size; j++){
                if(a[i]==a[j] && i!=j)
                       count++; }
          if(count==0)
              System.out.print(a[i]+" ");}}}