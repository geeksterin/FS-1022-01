import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int steps = scn.nextInt();
        
        while(n % 2 == 0){
            n /= 2;
            steps += 2;
        }
        while(n % 3 == 0){
            n /= 3;
            steps += 3;
        }
        while(n % 5 == 0){
            n /= 5;
            steps += 5;
        }

        System.out.println(steps);
        System.out.println(n);
    }
}