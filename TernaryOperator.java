import java.util.*;

public class TernaryOperator {
    public static void main(String args[]){
        //int num = 4;
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // // String ty = ((num%2==0)? "even" : "odd");
        // System.out.println(ty);

        int marks = sc.nextInt();
        String result = ((marks>=33) ? "pass": "fail" );
        System.out.println(result);
    }}