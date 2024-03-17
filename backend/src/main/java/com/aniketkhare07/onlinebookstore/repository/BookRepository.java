package com.aniketkhare07.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniketkhare07.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
