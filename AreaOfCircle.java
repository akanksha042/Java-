import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        
        //java default takes double so we have to typecast it by mentioning f at the last 
        float area = 3.14f * radius * radius;
        System.out.println("area of circle is =>" + area);
    }}