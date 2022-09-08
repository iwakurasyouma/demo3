package com.example.demo3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.entity.Posts;

public interface PostRepository extends JpaRepository<Posts, Integer>{

}
