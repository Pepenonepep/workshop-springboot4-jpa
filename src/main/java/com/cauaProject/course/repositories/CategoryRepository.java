package com.cauaProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauaProject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
