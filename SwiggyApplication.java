import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Restaurant {
    private int id;
    private String name;
    private String cuisine;
    private double rating;

    public Restaurant(int id, String name, String cuisine, double rating) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getRating() {
        return rating;
    }
}

class FoodItem {
    private int id;
    private String name;
    private double price;
    private int restaurantId;

    public FoodItem(int id, String name, double price, int restaurantId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.restaurantId = restaurantId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRestaurantId() {
        return restaurantId;
    }
}

class CartItem {
    private int foodItemId;
    private int quantity;

    public CartItem(int foodItemId, int quantity) {
        this.foodItemId = foodItemId;
        this.quantity = quantity;
    }

    public int getFoodItemId() {
        return foodItemId;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Order {
    private int orderId;
    private List<CartItem> items;
    private double totalAmount;
    private boolean isDelivered;

    public Order(int orderId, List<CartItem> items, double totalAmount) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.isDelivered = false;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }
}

public class SwiggyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Restaurant> restaurants = new ArrayList<>();
        List<FoodItem> menu = new ArrayList<>();
        List<Order> orders = new ArrayList();

        // Sample data
        restaurants.add(new Restaurant(1, "Tasty Bites", "Italian", 4.5));
        restaurants.add(new Restaurant(2, "Spice Delight", "Indian", 4.2));
        menu.add(new FoodItem(1, "Margherita Pizza", 12.99, 1));
        menu.add(new FoodItem(2, "Butter Chicken", 9.99, 2));

        boolean isRunning = true;
        int orderIdCounter = 1;

        while (isRunning) {
            System.out.println("Welcome to Swiggy-like Food Ordering System");
            System.out.println("1. View Restaurants");
            System.out.println("2. View Menu");
            System.out.println("3. Place an Order");
            System.out.println("4. View Orders");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewRestaurants(restaurants);
                    break;
                case 2:
                    viewMenu(menu, restaurants);
                    break;
                case 3:
                    placeOrder(scanner, menu, orders, orderIdCounter++);
                    break;
                case 4:
                    viewOrders(orders, menu);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void viewRestaurants(List<Restaurant> restaurants) {
        System.out.println("Available Restaurants:");
        for (Restaurant restaurant : restaurants) {
            System.out.println("ID: " + restaurant.getId());
            System.out.println("Name: " + restaurant.getName());
            System.out.println("Cuisine: " + restaurant.getCuisine());
            System.out.println("Rating: " + restaurant.getRating());
            System.out.println();
        }
    }

    private static void viewMenu(List<FoodItem> menu, List<Restaurant> restaurants) {
        System.out.println("Available Menu Items:");
        for (FoodItem item : menu) {
            Restaurant restaurant = findRestaurantById(restaurants, item.getRestaurantId());
            System.out.println("Item ID: " + item.getId());
            System.out.println("Name: " + item.getName());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Restaurant: " + restaurant.getName());
            System.out.println();
        }
    }

    private static Restaurant findRestaurantById(List<Restaurant> restaurants, int restaurantId) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == restaurantId) {
                return restaurant;
            }
        }
        return null;
    }

    private static void placeOrder(Scanner scanner, List<FoodItem> menu, List<Order> orders, int orderId) {
        System.out.println("Enter the number of items you want to order:");
        int numItems = scanner.nextInt();

        List<CartItem> cartItems = new ArrayList<>();
        double totalAmount = 0.0;

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the Food Item ID for item " + (i + 1) + ": ");
            int foodItemId = scanner.nextInt();

            FoodItem foodItem = findFoodItemById(menu, foodItemId);

            if (foodItem != null) {
                System.out.print("Enter the quantity for item " + (i + 1) + ": ");
                int quantity = scanner.nextInt();

                totalAmount += foodItem.getPrice() * quantity;

                cartItems.add(new CartItem(foodItemId, quantity));
            } else {
                System.out.println("Food item not found. Please check the ID and try again.");
            }
        }

        orders.add(new Order(orderId, cartItems, totalAmount));
        System.out.println("Order placed successfully!");
    }

    private static FoodItem findFoodItemById(List<FoodItem> menu, int foodItemId) {
        for (FoodItem item : menu) {
            if (item.getId() == foodItemId) {
                return item;
            }
        }
        return null;
    }

    private static void viewOrders(List<Order> orders, List<FoodItem> menu) {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }

        System.out.println("View Orders:");

        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Items:");
            for (CartItem item : order.getItems()) {
                FoodItem foodItem = findFoodItemById(menu, item.getFoodItemId());
                System.out.println("  - " + foodItem.getName() + " x" + item.getQuantity() + " ($" + foodItem.getPrice() + " each)");
            }
            System.out.println("Total Amount: $" + order.getTotalAmount());
            System.out.println("Order Status: " + (order.isDelivered() ? "Delivered" : "In progress"));
            System.out.println();
        }
    }
}
