import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        int sal = scn.nextInt();
        int exp = scn.nextInt();
        
        if( age > 60 && sal > 20000 && exp > 20){
            sal += 5000;
        }
        else if(age > 40 && sal > 15000 && exp > 10){
            sal += 2000;
        }
        else if(age > 30 && sal > 10000 && exp > 5){
            sal += 1000;
        }
        else{
            sal += 500;
        }
        System.out.println(sal);
        
    }
}