package com.example.springcrudl;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/lessons")
public class LessonsController {

    private final LessonRepository repository;

    public LessonsController(LessonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public Iterable<Lesson> all() {
        return this.repository.findAll();
    }
    @PostMapping("")
    public Lesson create(@RequestBody Lesson lesson) {
        return this.repository.save(lesson);
    }
    @GetMapping("/{id}")
    public Optional<Lesson> getLesson(@PathVariable("id") Long id){
        return this.repository.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable("id") Long id){
        this.repository.deleteById(id);
    }
    @PatchMapping("/{id}")
    public Lesson patchLesson(@PathVariable("id") Long id, @RequestBody Lesson body){
        Optional<Lesson> optional = this.repository.findById(id);
        Lesson lesson = optional.get();
        lesson.setTitle(body.getTitle());
        lesson.setDeliveredOn(body.getDeliveredOn());

        return this.repository.save(lesson);
    }


    }
