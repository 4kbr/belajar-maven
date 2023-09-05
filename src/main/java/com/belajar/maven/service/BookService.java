package com.belajar.maven.service;

import com.belajar.maven.domain.Author;
import com.belajar.maven.domain.Book;

public class BookService {
  private Book book;

  public BookService() {
    Author author = new Author();
    book = new Book(author);
  }

}
