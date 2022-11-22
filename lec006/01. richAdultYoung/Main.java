import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int age = scn.nextInt();
        int sal = scn.nextInt();
        
        if( age > 40 ){
        
            if( sal >= 30000 ){
                System.out.println("You are rich and adult");
            }
            else{
                System.out.println("You are an adult");
            }   
            
        }
        else{
            // age <= 40
            if( sal >= 12000 ){
                System.out.println("You are rich and young");
            }
            else{
                System.out.println("You are young");
            }
            
        }
        
        
    }
}