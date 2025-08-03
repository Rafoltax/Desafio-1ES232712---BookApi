package udb.desafio.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udb.desafio.bookapi.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
}
