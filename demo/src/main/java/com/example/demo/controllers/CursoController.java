package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Curso;
import com.example.demo.services.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/{idCurso}") // Mapeando a rota /curso/{idCurso}
    public String getCurso(@PathVariable Integer idCurso) {
        Curso curso = cursoService.getCurso(idCurso);
        return curso.toString();
    }
}
