package ca.ucalgary.ensf380;

import java.util.*;

public class MyBook {
    private static List<Book> books = new ArrayList<>();
 

   

    private static List<Book> searchByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book instanceof Fiction) {
                if (((Fiction) book).genre().equalsIgnoreCase(genre)) {
                    result.add(book);
                }
            } else if (book instanceof Nonfiction) {
                if (((Nonfiction) book).coverArt().equalsIgnoreCase(genre)) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    

    private static void listAllBooks() {
        for (Book book : books) {
            if (book instanceof Fiction) {
                Fiction fiction = (Fiction) book;
                System.out.println("Fiction Book - ISBN: " + fiction.getIsbn() + ", Pages: " + fiction.getPages() + ", Genre: " + fiction.genre());
            } else if (book instanceof Nonfiction) {
                Nonfiction nonfiction = (Nonfiction) book;
                System.out.println("Nonfiction Book - ISBN: " + nonfiction.getIsbn() + ", Pages: " + nonfiction.getPages() + ", Genre: " + nonfiction.coverArt());
            } else if (book instanceof Classic) {
                Classic classic = (Classic) book;
                System.out.println("Classic Book - ISBN: " + classic.getIsbn() + ", Pages: " + classic.getPages());
            }
        }
    }

    private static void searchBooksByGenre(Scanner scanner) {
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        List<Book> result = searchByGenre(genre);
        if (result.isEmpty()) {
            System.out.println("No books found for genre: " + genre);
        } else {
            for (Book book : result) {
                if (book instanceof Fiction) {
                    Fiction fiction = (Fiction) book;
                    System.out.println("Fiction Book - ISBN: " + fiction.getIsbn() + ", Pages: " + fiction.getPages() + ", Genre: " + fiction.genre());
                } else if (book instanceof Nonfiction) {
                    Nonfiction nonfiction = (Nonfiction) book;
                    System.out.println("Nonfiction Book - ISBN: " + nonfiction.getIsbn() + ", Pages: " + nonfiction.getPages() + ", Genre: " + nonfiction.coverArt());
                }
            }
        }
    }

    public static void main(String[] args) {
    	  books.add(new Novel("111-222-333", 350));
    	  books.add(new Novel("444-555-666", 400));
    	  books.add(new Anthology("777-888-999", 300));
    	  books.add(new Nonfiction("123-456-789", 200));
    	  books.add(new Classic());
    	  
    	  Scanner scanner = new Scanner(System.in);
          while (true) {
              System.out.println("Welcome to the Bookstore!");
              System.out.println("1. List all books");
              System.out.println("2. Search books by genre");
              System.out.println("3. Exit");
              System.out.print("Choose an option: ");
              int choice = scanner.nextInt();
              scanner.nextLine();  

              if (choice == 1) {
                  listAllBooks();
              } else if (choice == 2) {
                  searchBooksByGenre(scanner);
              } else if (choice == 3) {
                  System.out.println("Goodbye!");
                  break;
              } else {
                  System.out.println("Invalid choice. Please try again.");
              }
          }
          scanner.close();
    }
}
