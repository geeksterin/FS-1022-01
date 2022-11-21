import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        double far = scn.nextDouble();
        double cel = (far-32) * 5.0/9.0;
        
        System.out.println(cel);
        
        
    }
}