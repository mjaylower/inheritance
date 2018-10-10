public class Customer {

    // initiate all values being used in program by both res and comm
    String name;
    String phone;
    String address;
    String squareFootage;
    String seniorRate;
    String multiDiscount;

    // define all getters and setters to be used by residential and commercial classes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(String squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String isSeniorRate() {
        return seniorRate;
    }

    public void setSeniorRate(String seniorRate) {
        this.seniorRate = seniorRate;
    }

    public String isMultiDiscount() {
        return multiDiscount;
    }

    public void setMultiDiscount(String multiDiscount) {
        this.multiDiscount = multiDiscount;
    }

    // create the display method to show data that was entered passed on via each class

    static void display(String name, String phone, String address, double footage, boolean discount, double rate) {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Square Footage: " + footage);
        System.out.println("Discount: " + discount);
        System.out.println("Weekly Rate: $" + rate);
    }
}
