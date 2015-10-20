package javainterop;

import java.math.BigDecimal;
import java.util.List;

public class Book {
    private String _title;
    private BigDecimal _price;
    private List<Author> _authors;
    private Publisher _publisher;

    public Book(String title, BigDecimal price, List<Author> authors, Publisher publisher) {
        _title = title;
        _price = price;
        _publisher = publisher;
        _authors = authors;
    }

    public String getTitle() {
        return _title;
    }
    public void setTitle(String _title) {
        this._title = _title;
    }

    public BigDecimal getPrice() {
        return _price;
    }
    public void setPrice(BigDecimal _price) {
        this._price = _price;
    }

    public List<Author> getAuthors() {
        return _authors;
    }
    public void setAuthors(List<Author> _authors) {
        this._authors = _authors;
    }

    public Publisher getPublisher() {
        return _publisher;
    }
    public void setPublisher(Publisher _publisher) {
        this._publisher = _publisher;
    }
}
