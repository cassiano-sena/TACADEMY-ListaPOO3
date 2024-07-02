import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pessoa
        System.out.println("\n\n\n");
        System.out.println("Person");
        Person person = new Person("Alice", 35, 1.68, 65.0);
        System.out.println("\nDetails:");
        person.showDetails();
        person.growOlder();
        System.out.println("\nAfter growing older by one year:");
        person.showDetails();
        person.gainWeight(15.0);
        System.out.println("\nAfter gaining 15 kg:");
        person.showDetails();
        person.loseWeight(23.0);
        System.out.println("\nAfter losing 23 kg:");
        person.showDetails();

        //Produto
        System.out.println("\n\n\n");
        System.out.println("Product: ");
        Product product1 = new Product("Gaming Laptop", 5000.00, 10);
        Product product2 = new Product("Iphone 15", 8000.00, 15);
        Product product3 = new Product("Headphones", 150.00, 30);
        System.out.println("\nInitial Product Details:");
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();
        System.out.println();
        product3.displayDetails();
        System.out.println("\nUpdating stock...");
        product1.updateStock(5);
        product2.updateStock(10);
        product3.updateStock(0);
        System.out.println("\nUpdated Product Details:");
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();
        System.out.println();
        product3.displayDetails();
        System.out.print("Enter the quantity of " + product1.getName() + " to buy: ");
        int purchaseQuantity = scanner.nextInt();
        product1.updateStock(-purchaseQuantity);
        System.out.println("\nProduct Details After Purchase:");
        product1.displayDetails();

        //Filme
        System.out.println("\n\n\n");
        System.out.println("Movie: ");
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Elite Squad", "Crime", "José Padilha", 115, 2007));
        movieList.add(new Movie("The Matrix", "Action/Sci-Fi", "The Wachowskis", 136, 1999));
        movieList.add(new Movie("The Godfather", "Crime/Drama", "Francis Ford Coppola", 175, 1972));
        System.out.println("\n\n\n");
        System.out.println("Movie List: ");
        for (Movie movie : movieList) {
            movie.displayDetails();
            System.out.println();
        }
        System.out.println("Enter movie details to add to the list:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Duration (in minutes): ");
        int duration = scanner.nextInt();
        System.out.print("Release Year: ");
        int releaseYear = scanner.nextInt();
        movieList.add(new Movie(title, genre, director, duration, releaseYear));
        System.out.println("\nNewly Added Movie:");
        movieList.get(movieList.size() - 1).displayDetails();

        //Funcionário
        System.out.println("\n\n\n");
        System.out.println("Employee: ");
        Employee employee = new Employee("Alice Farias", "Junior Dev", 35000.0, "IT");
        employee.displayDetails();
        employee.promote("Senior Dev", 10000.0);
        System.out.println("\nAfter Promotion:");
        employee.displayDetails();

        //Casa
        System.out.println("\n\n\n");
        System.out.println("House: ");
        House myHouse = new House("123 Maple Street", 4, 250.0, 500000.0);
        myHouse.displayDetails();
        double propertyTax = myHouse.calculatePropertyTax();
        System.out.printf("Property Tax: $%.2f\n", propertyTax);

        //Celular
        System.out.println("\n\n\n");
        System.out.println("Cellphone: ");
        Cellphone myPhone = new Cellphone("Apple", "iPhone 14", 256);
        myPhone.installApp("WhatsApp");
        myPhone.installApp("Instagram");
        myPhone.installApp("Spotify");
        myPhone.displayInformation();
    }
}