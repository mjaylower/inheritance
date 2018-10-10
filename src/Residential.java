import java.util.Scanner;
// residential class a child class of the customer class
// customer values information initiated customer class available for use
class Residential extends Customer {

    Residential() {
        // create local bool variable to be used for conditional testing
        boolean senior;
        Scanner scanner = new Scanner (System.in);

        // obtain customer information via user input
        System.out.println("Residential");
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Phone: ");
        phone = scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Sq Ft: ");
        squareFootage = scanner.nextLine();
        double footage = Double.parseDouble(squareFootage); // change value type to double
        System.out.println("Senior Rate (T/F): ");
        seniorRate = scanner.nextLine();

        /*create if/else condition testing for purpose of calculating weekly rate
        check the user input for senior rate to match case and convert to boolean and run testing*/
        if (seniorRate.substring(0,1).equals("t") || seniorRate.substring(0,1).equals("T")) {
            senior = true;
        }
        else {
            senior = false;
        }
        // pass local values to residential class only thru to the calculateCharges method
        calculateCharges(senior, footage);

        }
        // accept the passed values of local variables and assign as needed
     private void calculateCharges(boolean senior, double footage) {
        double weeklyRate;  // created local variable to establish weekly payment rates
        if (!senior){  // create if/else condition testing for discount
            weeklyRate = footage * .006; // calculate weekly rate with no discount
        }
        else { // calculate weekly rate with 15% discount
            weeklyRate = (footage * .006) - ((footage * .006) * .15);
        }
        // pass all values back to the Customer class to be ran through the display method
         Customer.display(name, phone, address, footage, senior, weeklyRate);
    }
    }
