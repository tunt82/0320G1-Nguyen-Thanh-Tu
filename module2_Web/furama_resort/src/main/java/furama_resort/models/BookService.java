package furama_resort.models;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "booKService")
public class BookService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(targetEntity = Service.class)
    private Map<Service,Quantity> bookService;

    public BookService() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Service, Quantity> getBookService() {
        return bookService;
    }

    public void setBookService(Map<Service, Quantity> bookService) {
        this.bookService = bookService;
    }
}
