package javainterop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> _books;

    public Library(){
        _books = new ArrayList<>();

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Erich", "Gamma"));
        authors.add(new Author("Richard", "Helm"));
        authors.add(new Author("Ralph", "Johnson"));
        authors.add(new Author("John", "Vlissides"));
        _books.add(new Book("Design Patterns", new BigDecimal(37.88), authors, new Publisher("Addison-Wesley", "UK")));

        authors = new ArrayList<>();
        authors.add(new Author("Evert", "'t Reve"));
        authors.add(new Author("Karina", "van Irak"));
        _books.add(new Book("A Man, a plan, a canal: Panama", new BigDecimal(59.95), authors, new Publisher("O'Hara", "USA")));

        authors = new ArrayList<>();
        authors.add(new Author("Marco", "Pil"));
        _books.add(new Book("Sclal", new BigDecimal(9.95), authors, new Publisher("Marco Publishing", "Nederland")));
    }

    public List<Boek> getBoeken() {
        BoekenMapper boekenMapper = new BoekenMapper();
        return boekenMapper.getBoeken(_books);
    }
}
