import java.util.Scanner;

class Book {
    String title;
    int shelfNo;
}
public class Libraryms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];


        for (int i = 0; i < n; i++) {
            books[i] = new Book();
            System.out.print("Enter book title: ");
            books[i].title = sc.nextLine();
            System.out.print("Enter shelf number: ");
            books[i].shelfNo = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\nLibrary Books:");

        for (int i = 0; i < n; i++) {
            System.out.println("Book Title: " + books[i].title);
            System.out.println("Shelf Number: " + books[i].shelfNo);
        }
        sc.close();
    }
}