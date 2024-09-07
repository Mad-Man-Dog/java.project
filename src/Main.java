class User {
    private int id;
    private String name;
    private String emailAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void displayUserInfo() {
        System.out.println("User ID\t\t: " + id + "\nUser Name\t: " + name + "\nUser Email\t: " + emailAddress);
    }
}

class Customer extends User {
    private int starPoints;

    public int getStarPoints() {
        return starPoints;
    }

    public void setStarPoints(int starPoints) {
        this.starPoints = starPoints;
    }

    @Override
    public void displayUserInfo() {
        super.displayUserInfo();
        System.out.println("User Star Point\t: " + starPoints);
    }
}

class Order {
    private String name;
    private int quantity;
    private double price;

    public Order(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public double calculateTotalCost(double discount) {
        double d = (price * quantity) * discount / 100;
        return (price * quantity) - d;
    }
}

class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setId(101);
        c1.setName("John Doe");
        c1.setEmailAddress("johndoe@example.com");
        c1.setStarPoints(500);

        Order o1 = new Order("Shirt", 3, 25);

        System.out.println("User Information-------------------");
        c1.displayUserInfo();

        System.out.println("\nTotal cost of the order without discount: " + o1.calculateTotalCost());
        System.out.println("Total cost of the order with discount: " + o1.calculateTotalCost(10));
    }
}
