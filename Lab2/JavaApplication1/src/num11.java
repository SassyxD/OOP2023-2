import java.util.*;
public class num11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money: ");
        int money = sc.nextInt();
        System.out.println("");
        System.out.print("Input your money: ");
        char types = sc.next().charAt(0);
        System.out.println("");
        
        if (types == 'A'){
            System.out.println("Your total money in one year = " + (money + (money*15/1000)) );
        }else if (types == 'B'){
            System.out.println("Your total money in one year = " + (money + (money*20/1000)) );
        }else if (types == 'C'){
            System.out.println("Your total money in one year = " + (money + (money*15/1000)) );
        }else if (types == 'X'){
            System.out.println("Your total money in one year = " + (money + (money*50/1000)) );
        } 
    }
}