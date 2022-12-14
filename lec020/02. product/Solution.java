import java.io.*;
import java.util.*;

public class Solution {
    //defining our function
    public static int product(int A, int B){
        return A*B;
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        //calling product function
        System.out.println(product(A,B));
    }
}