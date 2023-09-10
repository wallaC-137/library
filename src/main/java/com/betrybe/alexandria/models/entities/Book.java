package com.betrybe.alexandria.models.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The type Book.
 */
@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String genre;

  /**
   * Instantiates a new Book.
   */
  public Book() {
  }

  /**
   * Instantiates a new Book.
   *
   * @param id    the id
   * @param title the title
   * @param genre the genre
   */
  public Book(Long id, String title, String genre) {
    this.id = id;
    this.title = title;
    this.genre = genre;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Gets title.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets title.
   *
   * @param title the title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets genre.
   *
   * @return the genre
   */
  public String getGenre() {
    return genre;
  }

  /**
   * Sets genre.
   *
   * @param genre the genre
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }
}
