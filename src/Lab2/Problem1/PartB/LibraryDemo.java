package Lab2.Problem1.PartB;

public class LibraryDemo {

    static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
        Book book2 = new Book("1984", "George Orwell", 1949, 328);

        DVD dvd1 = new DVD("Inception", "Christopher Nolan", 2010, 148);
        DVD dvd2 = new DVD("The Matrix", "Wachowski", 1999, 136);

        Magazine magazine1 = new Magazine("National Geographic", "Various", 2024, 3);
        Magazine magazine2 = new Magazine("Time Magazine", "Various", 2024, 12);

        System.out.println("Library Inventory");
        System.out.println(book1);
        System.out.println("Type: " + book1.getItemType());
        System.out.println();

        System.out.println(book2);
        System.out.println("Type: " + book2.getItemType());
        System.out.println();

        System.out.println(dvd1);
        System.out.println("Type: " + dvd1.getItemType());
        System.out.println();

        System.out.println(dvd2);
        System.out.println("Type: " + dvd2.getItemType());
        System.out.println();

        System.out.println(magazine1);
        System.out.println("Type: " + magazine1.getItemType());
        System.out.println();

        System.out.println(magazine2);
        System.out.println("Type: " + magazine2.getItemType());
        System.out.println();
    }
}
