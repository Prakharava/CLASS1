package College;
import java.util.*;
public class Firstlast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first_digit = 0;
        int last_digit = 0;
        last_digit = n%10;
        while(n!=0){
            first_digit = n%10;
            n = n/10;
        }
        System.out.println(first_digit);
        System.out.println(last_digit);
    }
}
