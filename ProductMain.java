import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Main {

    static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Read input
        for (int i = 0; i < 5; i++) {
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

       
        System.out.println("Input read successfully");

        int maxPid = products[0].pid;
        double maxPrice = products[0].price;

        for (int i = 1; i < 5; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        System.out.println("Product ID with highest price: " + maxPid);
        System.out.println("Total amount spent: " + calculateTotal(products));
    }
}

