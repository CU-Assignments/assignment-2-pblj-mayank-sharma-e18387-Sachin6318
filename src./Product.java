class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 750.50);
        product1.displayProduct();
    }
}
