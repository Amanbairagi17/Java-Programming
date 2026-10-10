package FaisalMemon.streams.Streams.TerminalOperation;

import FaisalMemon.streams.Streams.IntermediateOperation.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalBookChallenge {
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
    public static void main(String[] args) {
        List<Book> books = TerminalBookChallenge.createBookList();

        //Total cost of all books in the bookstore
        Stream<Book> totalCost = books.stream();
        double cost = totalCost.mapToDouble(book -> book.price).reduce(0,(acc, price) -> acc+price);
        System.out.println(cost);

        //Collecting books into list of titles
        List<String> bookTitle = books.stream().map(book -> book.title).collect(Collectors.toList());
        System.out.println(bookTitle);

        //Group books by category
        Map<String,List<Book>> byCategory = books.stream().collect(Collectors.groupingBy(Book::getCategory));
        byCategory.forEach((category, booklist) -> {
            booklist.forEach(System.out::println);
        });
    }
    public static Function<Book, String> bookStringFunction = new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}
