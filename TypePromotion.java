import java.util.*;

public class TypePromotion {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        char a = 'a';
        char b = 'b';
        //kaide se 1 aana chaiye
        // System.out.println((int)a);
        // System.out.println((int) b);
        // //mtlb agar expression hai tabhi numbers mai aayege otherwise
        // //they will consider as char as individual
        // System.out.println(a);
        // System.out.println(b-a);
        // //  and bingo wahi aaya


        //lets do some non sense 
        short ab = 5;
        char cg = 'c';
        byte by = 65;
        byte bt = (byte)(ab +by+cg);
        System.out.println(bt);
        //as i said nonsense anwer aaaya :>
        
    }}