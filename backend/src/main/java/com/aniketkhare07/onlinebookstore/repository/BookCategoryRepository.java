package com.aniketkhare07.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aniketkhare07.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="BookCategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
