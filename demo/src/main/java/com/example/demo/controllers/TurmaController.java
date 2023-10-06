package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Turma;
import com.example.demo.services.TurmaService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @GetMapping("/{idTurma}") // Mapeando a rota /curso/{idCurso}
    public Turma getTurma(@PathVariable Integer idTurma) throws JsonProcessingException{
        Turma turma = turmaService.getTurma(idTurma);
        return turma;
    }

    @PostMapping
    public void cadastrarTurma(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

    @PutMapping
    public void atualizar(@RequestBody Turma turma){
        turmaService.atualizar(turma);
        }
    

    @DeleteMapping("/{idTurma}")
    public void remover(@PathVariable Integer idTurma){
        turmaService.remover(idTurma);
        }
    
    
}

