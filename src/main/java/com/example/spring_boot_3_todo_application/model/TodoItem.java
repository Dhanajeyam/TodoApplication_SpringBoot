package com.example.spring_boot_3_todo_application.model;


import ch.qos.logback.core.model.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "todo_items")
public class TodoItem extends Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Boolean isComplete;
    private Instant createdAt;
    private Instant updatedAt;

    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', isComplete='%s', createdAt='%s', updatedAt='%s'}",
                id, description, isComplete, createdAt, updatedAt);
    }

}
