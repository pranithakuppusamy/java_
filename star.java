import java.util.*;
public class star {
    public static void main(String args[]){
        System.out.println(" the number of rows to be printed is 10:");
        int rows = 10;
        for (int i = 1; i <= rows; i++){
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } }}