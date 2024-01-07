import java.util.*;
public class num10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        if (n1 > 50000.00){
            System.out.println((10/100)*n1);
        }else if (n1 <= 50000.00){
            System.out.println((5/100)*n1);
        }
        
    }
}