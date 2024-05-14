package in.raj;

import in.raj.entity.Book;
import in.raj.repo.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        BookRepository repo = context.getBean(BookRepository.class);
        /*System.out.println(repo.getClass().getName());

        Book book = new Book();
        book.setBookId(103);
        book.setBookName("Angular");
        book.setBookPrice(2500.00);

        repo.save(book);//
        System.out.println("Record Inserted.");

        Optional<Book> byId = repo.findById(102);
        System.out.println(byId.get());

        Book b1 = new Book();
        b1.setBookId(104);
        b1.setBookName("React JS");
        b1.setBookPrice(1400.00);

        Book b2 = new Book();
        b2.setBookId(105);
        b2.setBookName("Vue JS");
        b2.setBookPrice(1899.00);

       */
        /* List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);*//*
        repo.saveAll(Arrays.asList(b1,b2));
        System.out.println("Record Inserted.....");*/

        /*boolean status = repo.existsById(105);
        System.out.println("Record presence : "+status);*/


        /*long counted = repo.count();
        System.out.println("Reocrd count :: "+counted);*/

        /*Optional<Book> byId = repo.findById(101);
        System.out.println("find by Id :: "+byId);

        if (byId.isPresent()){
            System.out.println(byId.get());
        }*/


       /* Iterable<Book> allById = repo.findAllById(Arrays.asList(101, 102, 103));
        for(Book b: allById){
            System.out.println(b);
        }*/


        /*System.out.println(repo.findAll());*/


        /*if (repo.existsById(104)){
            repo.deleteById(104);
            System.out.println("Delete successfully");
        }else {
            System.out.println("No record found");
        }*/
        /*List<Book> books = repo.findByBookPriceGreaterThan(2000.00);
        for (Book b: books){
            System.out.println(b);
        }


        List<Book> books1 = repo.findByBookPriceLessThan(2000.00);
        for (Book b: books1){
            System.out.println(b);
        }


        List<Book> books2 = repo.findBookByBookName("Spring");
        for(Book b: books2){
            System.out.println(b);
        }*/


        /*List<Book> books = repo.m1();
        for (Book b: books){
            System.out.println(b);
        }


        List<Book> b = repo.getBooks();
        System.out.println(b);*/



    }

}
