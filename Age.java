import java.util.Scanner;

public class Age {
    public static void main(String [] args){

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter your age." );

        int age = input.nextInt();

        if(age > 0) {
            if(age > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");
        }

    }
}
