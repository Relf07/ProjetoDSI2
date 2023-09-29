package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Requisicao{

    @Column
    private Integer Gets;

    @Column
    private Integer Posts;

    @Column
    private Integer Puts;

    @Column
    private Integer Deletes;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer Id;
}