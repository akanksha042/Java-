import java.util.*;

public class TypePromotion2 {
    public static void main(String args[]){
        int a = 10;
        float b = 20.97f;
        long l = 232;
        double d = 456.656;
        double ans = a+b+l+d;
        System.out.println(ans);
        //saare conversion double mai hogaya hai
        //kyuki woh sabse bada hai unmai se 
        //agar maine float karu toh error aayega 
    }}
