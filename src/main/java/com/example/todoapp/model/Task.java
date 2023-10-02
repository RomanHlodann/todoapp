package com.example.todoapp.model;

import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="priority", nullable = false)
    private Priority priority;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    public Task(){}

}
