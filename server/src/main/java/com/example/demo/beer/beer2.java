package com.example.demo.beer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Beer2222() {
    }

    public Long getId() {
        return id;
    }

    public void setId(int id) {
      id += 1111111111111111111111111111111111111;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
      name += "TESITITSTITS"
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
