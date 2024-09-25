import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

class Order {
    private List<MenuItem> items = new ArrayList<>();
    private double total = 0;

    public void addItem(MenuItem item) {
        items.add(item);
        total += item.getPrice();
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }
}

public class FoodOrderingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to Nirmal Restaurant.Please place your Orders");
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Chicken Burger", 5.99));
        menu.add(new MenuItem("Mushroom Pizza", 8.99));
        menu.add(new MenuItem("Spicy Chicken with Peanuts", 14.49));
	menu.add(new MenuItem("Chicken Biriyani", 12.29));
	menu.add(new MenuItem("Beef Shawarma", 10.89));
	menu.add(new MenuItem("Grill Chicken(Half)", 11.59));
	menu.add(new MenuItem("Chicken Tikka Masala", 15.29));
	menu.add(new MenuItem("Paneer Butter Masala", 9.49));
	menu.add(new MenuItem("Spaghetti Carbonara", 11.99));
	menu.add(new MenuItem("Vegetable Biryani", 8.79));
	menu.add(new MenuItem("Butter Croissants", 4.29));
	menu.add(new MenuItem("Cheeseburgers", 6.39));
        Order order = new Order();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(i + 1 + ". " + menu.get(i));
            }
            System.out.println("0. Checkout and Exit");

            System.out.print("Select an item (0 to checkout): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                isRunning = false;
            } else if (choice > 0 && choice <= menu.size()) {
                MenuItem selected = menu.get(choice - 1);
                order.addItem(selected);
                System.out.println(selected.getName() + " added to the order.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Order Summary:");
        List<MenuItem> items = order.getItems();
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + order.getTotal());

        System.out.println("Thank you for ordering!");

        scanner.close();
    }
}
