package qSpriders;

public class Product {
    private int productId;
    private String productName;
    private char productCategory;
    private double productPrice;

    public Product(int productId, String productName, char productCategory, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        setProductCategory(productCategory);
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public char getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(char productCategory) {
        // Check if the product category is valid (E, C, H, or T)
        if (productCategory == 'E' || productCategory == 'C' || productCategory == 'H' || productCategory == 'T') {
            this.productCategory = productCategory;
        } else {
            throw new IllegalArgumentException("Invalid product category: " + productCategory);
        }
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getCategoryName() {
        switch (productCategory) {
            case 'E':
                return "Electronics";
            case 'C':
                return "Cosmetics";
            case 'H':
                return "Home Appliance";
            case 'T':
                return "Toys";
            default:
                return "Unknown";
        }
    }

    public static void main(String[] args) {
        Product product = new Product(1, "Smartphone", 'E', 599.99);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Category Code: " + product.getProductCategory());
        System.out.println("Product Category: " + product.getCategoryName());
        System.out.println("Product Price: $" + product.getProductPrice());
        System.out.println("-----------------------------------------------");

        Product product2 = new Product(2, "Lipstick", 'C', 199.99);
        System.out.println("Product ID: " + product2.getProductId());
        System.out.println("Product Name: " + product2.getProductName());
        System.out.println("Product Category Code: " + product2.getProductCategory());
        System.out.println("Product Category: " + product2.getCategoryName());
        System.out.println("Product Price: $" + product2.getProductPrice());
    }
}

