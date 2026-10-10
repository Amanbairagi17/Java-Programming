package FaisalMemon.streams.Streams.IntermediateOperation;

import java.util.Objects;

public class Book {
    public String title;
    int publicationYear;
    public double price;
    String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Book(String title, int publicationYear, double price, String category) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(category, book.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publicationYear, price, category);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

}
