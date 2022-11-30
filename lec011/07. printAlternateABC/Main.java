import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char ch = 'a';
        for(int i = 0 ; i < 26; i++){
            if(i % 2 == 0){
                //even
                System.out.println(ch);
            }
            else{
                //odd
                System.out.println(Character.toUpperCase(ch));
            }
            ch++;
        }
        
        
    }
}