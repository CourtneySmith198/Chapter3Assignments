/**
 * @class: Ecommerce
 * @Author: Courtney Smith
 * @version: 0.1
 * @written on: September 17, 2023
 * course: ITEC 2140 - 13 Saturday Class
 * Description: Write a program that simulates a basic
 * e-commerce system. The user can choose between buy,
 * sell, and inventory. If the user chooses to buy,
 * check if the item is in stock. If the user chooses
 * to sell, you will create the program to ensure
 * they don't exceed the inventory limit.
 * The initial inventory is 50, inventory limit is 100.
 * - You will need to use switch-case, if-else
 * (class name: Ecommerce) - Hint: use switch - case
 * and inside of each case you need to use if-else
 */
import java.util.Scanner;
public class Ecommerce {
    public static void main(String[] args) {

        int inventory = 50, buy, sell;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ecommerce");
            System.out.println("Please choose between these options.");
            System.out.println("1: Buy");
            System.out.println("2: Sell");
            System.out.println("3: Inventory");
            System.out.println("4: Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to buy.");
                    buy = sc.nextInt();
                    if (inventory >= buy) {
                        System.out.println("Bought " + buy + " items.");
                        inventory = inventory - buy;
                    } else {
                        System.out.println("Inventory not available.");
                    }

                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter amount you would like to sell.");
                    sell = sc.nextInt();
                    inventory = inventory + sell;

                    if (inventory <= 100) {
                        System.out.println("Sold " + sell + " items.");
                    } else {
                        System.out.println("ERROR: Inventory has a limit of 100.");
                        inventory -= sell;
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Inventory: " + inventory);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}