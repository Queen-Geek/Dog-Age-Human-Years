import java.util.Scanner;

public class DogYears {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int dogYears;
      int humanYears;
      boolean quit = false;

      while (quit == false) {
        System.out.println("Input your dog's age in human years.");
        System.out.println("Input a number less than or equal to 0 to quit.");
        dogYears = scnr.nextInt();
        humanYears = 7 * dogYears;

        if (dogYears <= 0) {
            quit = true;
            System.out.println("Goodbye! See you next time!");
            break;
        }

        else {
            System.out.print(dogYears);
            System.out.print(" dog years is about ");
            System.out.print(humanYears);
            System.out.println(" human years.");
            System.out.println();
        }
      }
      
   }
}
