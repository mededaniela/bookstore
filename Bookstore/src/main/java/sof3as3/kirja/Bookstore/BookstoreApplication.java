package sof3as3.kirja.Bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sof3as3.kirja.Bookstore.model.Book;
import sof3as3.kirja.Bookstore.model.BookRepository;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class BookstoreApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);  // uusi loggeriattribuutti

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository bookRepository) {
		return (args) -> {
			log.info("save some books");
			Book book1 = new Book("No Longer Human", "Osamu Dazai", 1948);
			Book book2 = new Book("Runemarks", "Joanne Harris", 2007);
			bookRepository.save(book1);
			bookRepository.save(book2);
			
			log.info("fetch all books");
			for (Book book : bookRepository.findAll()) {
				log.info(book.toString());
			}
			
		};
	}
	

}
