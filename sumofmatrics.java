import java.util.*;
public class sumofmatrics{
    public static void main(String args[]){
       int row, col,i,j;
       Scanner in = new Scanner(System.in);
       System.out.println("ENTER THE NUMBER OF ROWS");
        row = in.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMNS");
        col = in.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];
        System.out.println("ENTER THE ELEMENTS OF MATRIX 1");
         for ( i= 0 ; i < row ; i++ ) { 
              for ( j= 0 ; j < col ;j++ )
                mat1[i][j] = in.nextInt();
                System.out.println();}
        System.out.println("ENTER THE ELEMENTS OF MATRIX 2");
          for ( i= 0 ; i < row ; i++ ){
             for ( j= 0 ; j < col ;j++ )
              mat2[i][j] = in.nextInt();
              System.out.println();
            }
         for ( i= 0 ; i < row ; i++ )
            for ( j= 0 ; j < col ;j++ )
            res[i][j] = mat1[i][j] + mat2[i][j] ; 
        System.out.println("Sum of matrices:-");
        for ( i= 0 ; i < row ; i++ ) { 
            for ( j= 0 ; j < col ;j++ )
            System.out.print(res[i][j]+"\t"); 
            System.out.println();}
        }
    }