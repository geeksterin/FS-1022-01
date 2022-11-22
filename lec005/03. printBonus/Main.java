import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int salary = scn.nextInt();
        int yos = scn.nextInt();
        
        if(yos > 5){
            //apply bonus
            int bonus = (salary * 5) / 100;
            System.out.println(bonus);
        }
        else{
            //no bonus
            System.out.println("0");
        }
    }
}