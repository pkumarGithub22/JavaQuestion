import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age==18){
        //     System.out.println("User able to do vote");
        // }
        // else{
        //     System.out.println("User not able to do vote ");
        // }
        int a = sc.nextInt();
        if(a==10){
            System.out.println("Equal");
        }
        else if(a>10){
            System.out.println(" a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
    }
}
