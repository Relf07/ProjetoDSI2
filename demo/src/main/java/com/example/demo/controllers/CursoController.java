package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Curso;
import com.example.demo.services.CursoService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/{idCurso}") // Mapeando a rota /curso/{idCurso}
    public Curso getCurso(@PathVariable Integer idCurso) throws JsonProcessingException{
        Curso curso = cursoService.getCurso(idCurso);
        return curso;
    }

    @PostMapping
        public void cadastrarCurso(@RequestBody Curso curso){
            cursoService.salvar(curso);
    }

    @PutMapping
        public void atualizar(@RequestBody Curso curso){
            cursoService.atualizar(curso);
        }
    

    @DeleteMapping("/{idCurso}")
        public void remover(@PathVariable Integer idCurso){
            cursoService.remover(idCurso);
        }
    
    
}

