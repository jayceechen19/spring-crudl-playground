package com.example.springcrudl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {
//    Lesson findOne(Long i/d);
}
