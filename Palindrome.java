package College;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = n;
        while(n>0){
            int rem = n%10;
            sum = rem + (sum*10);
            n = n/10;
        }
        if(a==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
