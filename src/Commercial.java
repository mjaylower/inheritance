import java.util.Scanner;
// commercial class a child class of the customer class
// customer values information initiated customer class available for use
class Commercial extends Customer {

    Commercial() {
        // create local bool variable to be used for conditional testing
        boolean multi;
        Scanner scanner = new Scanner(System.in);

        // obtain customer information via user input
        System.out.println("Commercial");
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Phone: ");
        phone = scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Sq Ft: ");
        squareFootage = scanner.nextLine();
        double footage = Double.parseDouble(squareFootage); // change value type to double
        System.out.println("Multi Property Discount (T/F): ");
        multiDiscount = scanner.nextLine();

        /*create if/else condition testing for purpose of calculating weekly rate
        check the user input for senior rate to match case and convert to boolean and run testing*/
        if (multiDiscount.substring(0, 1).equals("T") || multiDiscount.substring(0, 1).equals("t")) {
            multi = true;
        } else {
            multi = false;
        }

        // pass local values to commercial class only through to the calculateCharges method
        calculateCharges(multi, footage);
    }

    // accept the passed values of local variables and assign as needed
    private void calculateCharges(boolean multi, double footage) {
        double weeklyRate; // created local variable to establish weekly payment rates
        if (!multi) { // create if/else condition testing for discount
            weeklyRate = footage * .005; // calculate weekly rate with no discount
        } else {
            weeklyRate = (footage * .005) - ((footage * .005) * .1); // calculate weekly rate with 10% discount
        }

        // pass all values back to the Customer class to be ran through the display method
        Customer.display(name, phone, address, footage, multi, weeklyRate);

    }
}
