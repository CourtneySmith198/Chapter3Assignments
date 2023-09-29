/**
 * @class: Transportation
 * @Author: Courtney Smith
 * @version: 0.1
 * @written on: September 18, 2023
 * course: ITEC 2140 - 13 Saturday Class
 * Description: Write a program that simulates a basic transportation
 * system. The user can choose a mode of transportation ("car",
 * "train", "plane"). Depending on the choice, they can then
 * choose a specific model or type, and the program will display
 * its maximum speed. (class name: Transportation)
 */
import java.util.Scanner;
public class Transportation {

    public static void main(String[] args) {

        int sedanMax = 120;
        int sportsMax = 200;
        int bulletMax = 250;
        int freightMax = 70;
        int jetMax = 600;
        int propellerMax = 200;

        boolean proceedThrough = true;

        Scanner input = new Scanner(System.in);

        while (proceedThrough) {
            System.out.println("Transportation");
            System.out.println("Enter mode of transportation:");
            System.out.println("Car");
            System.out.println("Train");
            System.out.println("Plane");
            String transportType = input.nextLine();

            if(transportType.equalsIgnoreCase("car")) {
                System.out.println("Enter type of car (sedan or sports):");
                String carType = input.nextLine();

                if (carType.equalsIgnoreCase("sedan")) {
                    System.out.println("Maximum Speed: " + sedanMax + " mph.");
                } else if (carType.equalsIgnoreCase("sports")) {
                    System.out.println("Maximum Speed: " + sportsMax + " mph.");
                } else {
                    System.out.println("Unknown input. Please try again.");
                }
            }

            if(transportType.equalsIgnoreCase("train")) {
                System.out.println("Enter type of train (bullet or freight):");
                String trainType = input.nextLine();

                if (trainType.equalsIgnoreCase("bullet")) {
                    System.out.println("Maximum Speed: " + bulletMax + " mph.");
                } else if (trainType.equalsIgnoreCase("freight")) {
                    System.out.println("Maximum Speed: " + freightMax + " mph.");
                } else {
                    System.out.println("Unknown input. Please try again.");
                }
            }

            if(transportType.equalsIgnoreCase("plane")) {
                System.out.println("Enter type of plane(jet or propeller): ");
                String planeType = input.nextLine();

                if (planeType.equalsIgnoreCase("jet")) {
                    System.out.println("Maximum Speed: " + jetMax + " mph.");
                } else if (planeType.equalsIgnoreCase("propeller")) {
                    System.out.println("Maximum Speed: " + propellerMax + " mph.");
                } else {
                    System.out.println("Unknown input. Please try again.");
                }
            }
                while(true) {
                    System.out.println("Would you like to continue? Yes or No");
                    String proceed = input.nextLine();
                    if(proceed.equalsIgnoreCase("yes")) {
                    break;
                    } else if (proceed.equalsIgnoreCase("no")){
                    System.out.println("Thank you for using this program. Goodbye.");
                    proceedThrough = false;
                    break;
                    }
                }
        }
        input.close();
    }
}
