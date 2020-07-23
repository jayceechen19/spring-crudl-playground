package com.example.springcrudl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.*;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {
   Lesson findByTitle(String title);

   List<Lesson> findByDeliveredOnBetween(Date date1, Date date2);
}
