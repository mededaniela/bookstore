package sof3as3.kirja.Bookstore.model;

import org.springframework.data.repository.CrudRepository;

//tietokantakäsittelyn rajapinta
public interface BookRepository extends CrudRepository<Book, Long> {
	
	

}