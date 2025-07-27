
import animal.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Barn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner object for input
        ArrayList<Cow> cows = new ArrayList<>(); // list for storing cow objects
        ArrayList<Chicken> chickens = new ArrayList<>(); // list for storing chicken objects

        System.out.print("How many animals in the barn? ");
        int num = input.nextInt(); // total number of animals to input
        input.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter animal #" + (i + 1) + " type (cow/chicken): ");
            String type = input.nextLine().toLowerCase();

            if (type.equals("cow")) {
                System.out.print("Enter milk per day for cow: ");
                int milk = input.nextInt(); // milk per day
                input.nextLine();
                Cow cow = new Cow(milk); // create cow object
                cows.add(cow); // add to list
            } else if (type.equals("chicken")) {
                System.out.print("Enter egg color for chicken: ");
                String color = input.nextLine(); // egg color
                Chicken chicken = new Chicken(color); // create chicken object
                chickens.add(chicken); // add to list
            } else {
                System.out.println("Unknown animal type. Skipping...");
            }
        }

        // cow details
        System.out.println("\n--- All Cows ---");
        for (Cow c : cows) {
            System.out.println("Type: " + c.getType() + ", Milk per day: " + c.getMilkPerDay() + "L");
        }

        // chicken details
        System.out.println("\n--- All Chickens ---");
        for (Chicken ch : chickens) {
            System.out.println("Type: " + ch.getType() + ", Egg Color: " + ch.getEggColor());
        }

        input.close(); // close
    }
}   // class