package qSpriders;

public class Shopping {
    // Attributes
    private String productName;
    private int productId;
    private double productPrice;

    // Constructor
    public Shopping(String productName, int productId, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    // Method to order a product
    public void orderProduct(String productName, double productPrice) {
        if (productPrice > 5000) {
            productPrice -= 1000; // Apply a discount of 1000 if price is more than 5000
            System.out.println("Order placed. Product Name: " + productName + ", Product Price after discount: " + productPrice);
        } else {
            System.out.println("Order placed. Product Name: " + productName + ", Product Price: " + productPrice);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Shopping class
        Shopping shopping = new Shopping("Laptop", 101, 6000.0);

        // Call the orderProduct method
        shopping.orderProduct(shopping.productName, shopping.productPrice);

        // Create an instance of the Shopping class
        Shopping shopping2 = new Shopping("Mouse", 102, 600.0);

        // Call the orderProduct method
        shopping2.orderProduct(shopping2.productName, shopping2.productPrice);
    }
}

