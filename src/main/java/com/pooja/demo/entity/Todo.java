package com.pooja.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Todo
{
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private boolean completed;
    public int getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public boolean isCompleted()
    {
        return completed;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setCompleted(boolean completed)
    {
        this.completed=completed;
    }




}
