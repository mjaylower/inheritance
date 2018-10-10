import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // display menu of choices
        System.out.println("What type of customer?");
        System.out.println("1: Residential");
        System.out.println("2: Commercial");
        System.out.println("3: Exit");

        // initiate the choice variable to make selection
        int choice =  scanner.nextInt();

        // whilte the choice isn't a menu option, ask for a valid number
        while (choice != 1 & choice != 2 & choice !=3) {
            System.out.println("Please enter a valid number");
            choice = scanner.nextInt();
        }

        // when valid entry is given perform switch
        switch (choice) {
            case 1: new Residential(); //if 1 - run residential class
            break;

            case 2: new Commercial(); // if 2 - run commercial class
            break;

            case 3: exit(); // if 3 - exit program
            break;
        }
    }
}
