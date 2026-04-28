package com.pooja.demo.controller;

import com.pooja.demo.entity.Todo;
import com.pooja.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TodoController {
    @Autowired
    private TodoService service;
    @PostMapping("/add")
    public Todo addTodo(@RequestBody Todo todo)
    {
        return service.save(todo);
    }
    @GetMapping("/all")
    public List<Todo> getAllTodo()
    {
        return service.getAll();
    }
    @GetMapping("/toto/{id}")
    public Todo getTodo(@PathVariable int id)
    {
        return service.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id)
    {
        service.delete(id);
        return "Deleted Successfully";
    }
    @PutMapping("/update/{id}")
    public Todo updateTodo(@PathVariable int id,@RequestBody Todo todo)
    {
        Todo ex=service.getById(id);
        if(ex!=null)
        {
            ex.setTitle(todo.getTitle());
            ex.setCompleted(todo.isCompleted());
           return service.save(ex);
        }
        return null;
    }

}