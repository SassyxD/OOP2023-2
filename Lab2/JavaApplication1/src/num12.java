import java.util.*;
public class num12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = 0;
        System.out.print("Please insert your name: ");
        String name = sc.nextLine();
        System.out.print("PLease insert your age: ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days: ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert numver of absent days: ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight: ");
        int weight = sc.nextInt();
        
        System.out.println("Hi, " + name);
        if ((age >= 21) && (age <=30)){
            salary = ((numDay1*300)-(numDay2*50));
            System.out.println("Your salary is " + salary + " baht");
        }else if ((age >= 31) && (age <=40)){
            salary = ((numDay1*500)-(numDay2*50));
            System.out.println("Your salary is " + salary + " baht");
        }else if ((age >= 41) && (age <=50)){
            salary = ((numDay1*1000)-(numDay2*25));
            System.out.println("Your salary is " + salary + " baht");
        }else if ((age >= 51) && (age <=60)){
            salary = (numDay1*3000);
            System.out.println("Your salary is " + salary + " baht");
        }
        
        if ((weight >= 10) && (weight <= 60)){
            System.out.println("Your salary and bonus is " + (salary + 5000) + " baht");
        }else if ((weight >= 61) && (weight <= 90)){
            System.out.println("Your salary and bonus is " + (salary + (5000 - ((weight - 60)* 10))) + " baht");
        }else {
            System.out.println("Your salary and bonus is " + salary + " baht");
        }
        
            
    }
}