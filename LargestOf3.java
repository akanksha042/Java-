import java.util.*;

public class LargestOf3 {
    public static void main(String args[]){
        int a = 10;
        int b = 105;
        int c = 200;
        // if(a>b){
        //     if(a>c){
        //         System.out.println("A is greater");
        //     }
        //     else {
        //         System.out.println("C is greater");
        //     }
        // }
        // if(b>a){
        //     if(b>c){
        //         System.out.println("B is greater");
        //     }
        //     else {
        //         System.out.println("C is greater");
        //     }
        // }





        //another method
        if(a>b && a>c){
            System.out.println("A is Largest");
        }
        else if(b>a && b>c){
            System.out.println("B is Largest");
        }
        else {
            System.out.println("C is Largest");
        }
    
        }}