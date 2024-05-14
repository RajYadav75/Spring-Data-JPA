package in.raj.repo;

import in.raj.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {
   /*
   //select * from book where book_price > : price
    public List<Book> findByBookPriceGreaterThan(Double price);

    // select * from book where book_price < : price
    public List<Book> findByBookPriceLessThan(Double price);

    // select * from book where book_name == : bookName
    public List<Book> findBookByBookName(String bookName);
    */
    @Query(value = "select * from book",nativeQuery = true)
    public List<Book> m1();

    @Query("from Book ")
    public List<Book> getBooks();





}


