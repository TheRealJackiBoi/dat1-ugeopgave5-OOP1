package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        customers.add(new Customer("Jack", "Oulund", "JackiBoi"));
        customers.add(new Customer("Julius", "Lassen", "Preben"));
        customers.add(new Customer("Oliver", "Madsen", "MadsenGaming"));
        customers.add(new Customer("Marcus", "?", "Guf"));
        customers.add(new Customer("Tobias", "Berg", "Sypagan"));
        customers.add(new Customer("Sander", "Roust", "Snader"));

        printCustomers();
    }

    public static void printCustomers() {
        for (Customer c :
                customers) {
            System.out.println(c);
        }
    }
}
