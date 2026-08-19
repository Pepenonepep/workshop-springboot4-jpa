package com.cauaProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauaProject.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
