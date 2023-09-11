package com.betrybe.alexandria.services;

import com.betrybe.alexandria.models.entities.Book;
import com.betrybe.alexandria.models.entities.BookDetail;
import com.betrybe.alexandria.models.repositories.BookDetailRepository;
import com.betrybe.alexandria.models.repositories.BookRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository bookRepository;
  private final BookDetailRepository bookDetailRepository;

  @Autowired
  public BookService(BookRepository bookRepository, BookDetailRepository bookDetailRepository) {
    this.bookRepository = bookRepository;
    this.bookDetailRepository = bookDetailRepository;
  }

  public Book insert(Book book) {
    return bookRepository.save(book);
  }

  public Optional<Book> updateBook(Long id, Book book) {
    Optional<Book> optionalBook = bookRepository.findById(id);

    if (optionalBook.isPresent()) {
      Book bookFromDB = optionalBook.get();
      bookFromDB.setTitle(book.getTitle());
      bookFromDB.setGenre(book.getGenre());

      Book updatedBook = bookRepository.save(bookFromDB);
      return Optional.of(updatedBook);
    }
    return optionalBook;
  }

  public Optional<Book> removeBook(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);

    if (optionalBook.isPresent()) {
      bookRepository.deleteById(id);
    }
    return optionalBook;
  }

  public Optional<Book> findById(Long id) {
    return bookRepository.findById(id);
  }

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  public BookDetail insertBookDetail(BookDetail bookDetail) {
    return bookDetailRepository.save(bookDetail);
  }

  public Optional<BookDetail> updateBookDetail(Long id, BookDetail bookDetail) {
    Optional<BookDetail> optionalBookDetail = bookDetailRepository.findById(id);

    if (optionalBookDetail.isPresent()) {
      BookDetail bookDetailFromDB = optionalBookDetail.get();
      bookDetailFromDB.setSummary(bookDetail.getSummary());
      bookDetailFromDB.setYear(bookDetail.getYear());
      bookDetailFromDB.setPageCount(bookDetail.getPageCount());
      bookDetailFromDB.setIsbn(bookDetail.getIsbn());

      BookDetail updatedBookDetail = bookDetailRepository.save(bookDetailFromDB);
      return Optional.of(updatedBookDetail);
    }
    return optionalBookDetail;
  }

  public Optional<BookDetail> removeBookDetail(Long id) {
    Optional<BookDetail> optionalBookDetail = bookDetailRepository.findById(id);

    if (optionalBookDetail.isPresent()) {
      bookDetailRepository.deleteById(id);
    }
    return optionalBookDetail;
  }

  public Optional<BookDetail> findByIdBookDetail(Long id) {
    return bookDetailRepository.findById(id);
  }
}
