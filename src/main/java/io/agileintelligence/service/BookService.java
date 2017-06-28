package io.agileintelligence.service;

import io.agileintelligence.domain.Book;

import java.util.List;

/**
 * Created by carlosarosemena on 2017-06-26.
 */
public interface BookService {

    List<Book> findAll();
    Book findOne(Long id);
}
