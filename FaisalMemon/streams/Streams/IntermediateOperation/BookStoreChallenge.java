package FaisalMemon.streams.Streams.IntermediateOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BookStoreChallenge {
    public static List<Book> createBookList() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Hitchhiker's Guide to the Galaxy", 1979, 12.99, "Science Fiction"));
        books.add(new Book("Pride and Prejudice", 1813, 8.50, "Classics"));
        books.add(new Book("To Kill a Mockingbird", 1960, 10.75, "Fiction"));
        books.add(new Book("Dune", 1949, 9.99, "Dystopian"));
        books.add(new Book("The Great Gatsby", 1925, 11.20, "Classics"));
        books.add(new Book("Dune", 1965, 14.50, "Science Fiction"));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 1997, 15.00, "Fantasy"));
        books.add(new Book("Educated", 2018, 18.99, "Memoir"));
        books.add(new Book("Sapiens: A Brief History of Humankind", 2011, 20.50, "Non-Fiction"));
        books.add(new Book("Where the Crawdads Sing", 2018, 16.95, "Fiction"));
        books.add(new Book("The Lord of the Rings: The Fellowship of the Ring", 1954, 13.75, "Fantasy")); // Eleventh for good measure

        return books;
    }
    /*
       - Discounted Books: The bookstore is planning a sale.
         - Identify all books that are priced over $10. Display these books.
       - Classics Collection: The bookstore is launching a classics collection.
         - Identify and display books that were published before the year 2000.
       - Upcoming Titles: Generate a list of future book titles for the next year
         by adding the suffix "(Coming Soon)" to all the current titles.
       - Sort by Price: The bookstore wants to print price tags for all the books.
         - Display the books sorted by their prices in ascending order.
       - Rare Books: The bookstore believes there might be rare books in the
         collection. A rare book is one where the title has more than 20
         characters. Identify and display these books.
       */
    public static void main(String[] args) {
        List<Book> books = BookStoreChallenge.createBookList();

        //DISCOUNT ON BOOKS
        Stream<Book> discountedBook = books.stream().filter(book -> book.price > 15);
        discountedBook.forEach(System.out::println);

        //DISPLAY BOOKS THAT PUBLISH BEFORE 1990
        System.out.println("Classic Collection Before 1990s");
        Stream<Book> classicCollection = books.stream().filter(book -> book.publicationYear < 1990);
        classicCollection.forEach(System.out::println);

        //UPCOMING BOOKS TITLE
        System.out.println("Upcoming books in next year");
        Stream<String> upcomingBookTitle = books.stream().map(book -> book.title+" COMING SOON");
        upcomingBookTitle.forEach(System.out::println);

        //SORT PRICE
        System.out.println("Books in sorted according to price ");
        Stream<Book> sortedPrice = books.stream().sorted(Comparator.comparingInt(book -> (int) book.price));
        sortedPrice.forEach(System.out::println);

        //RARE BOOK IN COLLECTION
        System.out.println("Rare book in collection those having more than 20 character");
        Stream<Book> rareBook = books.stream().filter(book -> book.title.length() >= 20);
        rareBook.forEach(System.out::println);


    }
}
