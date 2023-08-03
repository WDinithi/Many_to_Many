package lk.IJSE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Book {
    @Id
    String B_id;
    String B_name;
    String ISBN;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public Book() {

    }

    public String getB_id() {
        return B_id;
    }

    public void setB_id(String b_id) {
        B_id = b_id;
    }

    public void setB_name(String b_name) {
        B_name = b_name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String b_id, String b_name, String ISBN) {
        this.B_id= b_id;
        this.B_name = b_name;
        this.ISBN = ISBN;
    }

}
