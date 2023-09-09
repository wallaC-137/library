package com.betrybe.alexandria.models.repositories;

import com.betrybe.alexandria.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Book repository.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}