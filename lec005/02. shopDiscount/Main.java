import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int units = scn.nextInt();
        
        int totalAmt = 100 * units;
        
        if(totalAmt > 1000){
            int discount = (totalAmt * 10) / 100;
            totalAmt = totalAmt - discount;
        }
        
        System.out.println(totalAmt);
        
    }
}