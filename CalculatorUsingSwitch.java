import java.util.*;



public class CalculatorUsingSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for a ");

        int a = sc.nextInt();
        System.out.println("enter value for b ");
        int b = sc.nextInt();
        System.out.println("enter operator + - / * % ");
        char Operation = sc.next().charAt(0);
        switch(Operation){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Invalid Operations");
        }
    }}
