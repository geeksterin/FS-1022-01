import java.io.*;
import java.util.*;

public class Solution {

    public static int countDigits(int n){
        int count  = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
    public static void printReverse(int n){
        //just solved this one
        while(n > 0){
            int d = n % 10;
            System.out.println(d);
            //decompose
            n /= 10;
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int totalDigits = countDigits(n);
        System.out.println(totalDigits);
        printReverse(n);
    }
}