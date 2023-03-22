import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        // Add at least 3 textbooks to the library
        TextBook textbook1 = new TextBook("Chemistry", "John Smith", 3, true);
        TextBook textbook2 = new TextBook("Calculus", "Alice Johnson", 7, false);
        TextBook textbook3 = new TextBook("Biology", "David Lee", 4, true);
        library.add(textbook1);
        library.add(textbook2);
        library.add(textbook3);

        // Add at least 3 novels to the library
        Novel novel1 = new Novel("Pride and Prejudice", "Jane Austen", 10, "Romance");
        Novel novel2 = new Novel("To Kill a Mockingbird", "Harper Lee", 9, "Fiction");
        Novel novel3 = new Novel("1984", "George Orwell", 12, "Dystopian");
        library.add(novel1);
        library.add(novel2);
        library.add(novel3);

        // Print out the books in the library
        for (Book book : library) {
            System.out.println(book.toString() + " by " + book.getAuthor());
            if (book instanceof TextBook) {
                TextBook textbook = (TextBook) book;
                System.out.println("\tEdition: " + textbook.getEdition());
                System.out.println("\tEbook: " + textbook.isEbook());
            } else if (book instanceof Novel) {
                Novel novel = (Novel) book;
                System.out.println("\tReading level: " + novel.getReadingLevel());
                System.out.println("\tGenre: " + novel.getGenre());
            }
        }
    }
}