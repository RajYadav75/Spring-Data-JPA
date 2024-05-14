package in.raj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
//@Table(name = "book_tbl")
public class Book {
    @Id
    private Integer bookId;
    private String bookName;
    private Double bookPrice;
}
