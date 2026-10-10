package FaisalMemon.streams.Streams.IntermediateOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {
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
        List<Book> bookList = IntermediateDemo.createBookList();
       // bookList.forEach(System.out::println);

        //1. Filtering : Book cheaper than $15
//        Stream<Book> stream1 = bookList.stream();
//        Stream<Book> stream2 = stream1.filter(predicate);
//        stream2.forEach(System.out::println);
         bookList.stream().filter(book-> book.price<15).forEach(System.out::println);

         //2. Mapping : Book title in uppercase
        Stream<String> upperCaseTitles = bookList.stream().map(book -> book.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);

        //3. SORTING : Books by publication date
        Stream<Book> sortedBook = bookList.stream().sorted(Comparator.comparingInt(book-> book.publicationYear));
        sortedBook.forEach(System.out::println);

        //4. DISTINCT : Remove Duplicate titles
        Stream<Book> distinctBook = bookList.stream().distinct();
        distinctBook.forEach(System.out::println);// It remove duplicate values only when you override the equals and hashcode method in your class

        //5. Limit : Display only first 3 Books
//        Stream<Book> firstThreeBooks = bookList.stream().limit(3);
//        firstThreeBooks.forEach(System.out::println);

        //5. Limit : Display only first 3 Books by publish date
        System.out.println("DISPLAY FIRST 3 BOOKS BY PUBLICATION YEAR");
        Stream<Book> firstThreeBooks = bookList.stream().sorted(Comparator.comparingInt(book-> book.publicationYear)).limit(3);
        firstThreeBooks.forEach(System.out::println);

        //6. Skip : Skip First 2 books
        System.out.println("Display After skipping 2 books");
        Stream<Book> skipBooks = bookList.stream().skip(2);
        skipBooks.forEach(System.out::println);

    }

    public static Predicate<Book> predicate = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price < 15;
        }
    };
}
