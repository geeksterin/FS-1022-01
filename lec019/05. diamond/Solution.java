import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int star = 1;
        int space = n-1;
        
        for(int rows = 1 ; rows <= (2*n) - 1; rows++){
            for(int csp = 1; csp <= space; csp++){
                System.out.print(" ");
            }
            for(int cst = 1; cst <= star; cst++){
                System.out.print("*");
            }
            System.out.println();
            
            if(rows < n){
                //upper half
                star += 2;
                space--;
            }
            else{
                //lower half
                star -= 2;
                space++;
            }
            
            
        }
        
    }
}