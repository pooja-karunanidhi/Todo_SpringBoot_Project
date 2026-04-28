package com.pooja.demo.service;


import com.pooja.demo.entity.Todo;
import com.pooja.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repo;
    public Todo save(Todo todo)
    {
        return repo.save(todo);
    }
   public List<Todo> getAll()
   {
       return repo.findAll();
   }
   public Todo getById(int id)
   {
       return repo.findById(id).orElse(null);
   }
   public void delete(int id)
   {
       repo.deleteById(id);
   }



}