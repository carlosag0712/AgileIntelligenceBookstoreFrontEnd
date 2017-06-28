package io.agileintelligence.repository;

import io.agileintelligence.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by carlosarosemena on 2017-06-26.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
