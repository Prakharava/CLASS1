package College;
import java.util.*;
public class Table {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
        System.out.println(a +"*"+ i+ "="+ a*i);
    }
    }
}
