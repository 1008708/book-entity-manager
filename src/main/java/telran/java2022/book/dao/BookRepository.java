package telran.java2022.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import telran.java2022.book.model.Book;

public interface BookRepository {
	List<Book> findByAuthorsName(String authorName);
	
	List<Book> findByPublisherName(String publisherName);

	boolean existsById(String isbn);

	Optional<Book> findById(String isbn);
	
	Book save(Book book);
	
	void delete(Book book);

	void deleteById(String isbn);
}
