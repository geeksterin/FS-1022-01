import java.io.*;
import java.util.*;

public class Solution {
    public static double calcArea(double r){
        return (3.14 * r * r);
    }
    
    public static double calcPerimeter(double r){
        return (3.14 * 2 * r);
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double r = scn.nextDouble();
        
        double area = calcArea(r);
        double perimeter = calcPerimeter(r);
        
        System.out.println(area);
        System.out.println(perimeter);
        
        
    }
}