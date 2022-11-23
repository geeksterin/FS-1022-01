import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        int rank = scn.nextInt();
        
        if( marks < 20 || rank > 100){
            System.out.println("Needs improvement");
        }
        else if( marks < 40 || rank > 80){
            System.out.println("Concentrate");
        }
        else if(marks < 60 || rank > 120){
            System.out.println("Needs to focus");
        }
        else if(marks > 100 || rank < 10){
            System.out.println("Very good");
        }
        else{
            System.out.println("Bright Student");
        }
    }
}