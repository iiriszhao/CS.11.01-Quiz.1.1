import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Enter your age:");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your name:");
        firstName = scanner.nextLine();
        System.out.println("Enter your favourite food:");
        favouriteFood = scanner.nextLine();

        System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood);

    }
}
