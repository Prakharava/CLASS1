package College;
import java.util.*;
public class Compound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextInt();    //principle amount
        double r = sc.nextInt();    //rate of interest
        double n = sc.nextInt();    //time period
        double Amt = p*(Math.pow((1+r/100),n));    //Amount
        double CI = Amt - p;
        System.out.println(CI);
    }    
}
