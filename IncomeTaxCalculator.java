import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String args[]){
        System.out.println("Income is in Lakh");
        Scanner sc = new Scanner(System.in);
        int income =sc.nextInt();
        // if(income<5){
        //     System.out.println("0% tax ");
        // }
        // else if(income>5 || income<10){
        //     System.out.println("20% tax");
        // }
        // else {
        //     System.out.println("30% tax");
        // }




        int tax; // automaticaly 0 put kardega
        if(income < 500000){
            tax = 0;
        }
        else if(income >500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }
        System.out.println("your tax is : " + tax);

    }}