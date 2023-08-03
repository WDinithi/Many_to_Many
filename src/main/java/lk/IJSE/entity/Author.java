package lk.IJSE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    String A_id;
    String First_name;
    String Last_name;

    @ManyToMany
    private List<Book> books;


    public void setA_id(String a_id) {
        A_id = a_id;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public Author(){

    }
    public Author(String a_id, String first_name, String last_name){
       A_id=a_id;
       First_name=first_name;
       Last_name=last_name;
    }


}
