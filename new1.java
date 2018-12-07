import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

<<<<<<< HEAD
        System.out.print("Enter a number: anything ");
=======
        System.out.print("Enter a number: but me ");
>>>>>>> tester
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
