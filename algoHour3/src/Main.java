// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int n;

            System.out.println("Enter an integer: ");
            n = keyboard.nextInt();
            for(int i = 1; i <= n; i++)
            {
                if(i % 3 == 0 )
                {
                    System.out.println("Fizz");
                }
                else if(i % 5 == 0 )
                {
                    System.out.println("Buzz");
                }
                else if(i % 5 == 0 && i % 3 == 0)
                {
                    System.out.println("FizzBuzz");
                }
                else {
                    System.out.println(i);

                }
            }
    }
}