package College;
import java.util.*;
public class Greatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        max = (a>b && a>c)?a:(b>a && b>c)?b:c;
        System.out.println(max);
    }
}
