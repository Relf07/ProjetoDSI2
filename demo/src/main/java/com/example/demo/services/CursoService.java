package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Curso;
import com.example.demo.repositories.CursoRepository;

@Service

public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso salvar(Curso curso){
        return cursoRepository.save(curso);

    }

    public void remover(Integer IdCurso){
        cursoRepository.deleteById(IdCurso);
    }

    public Curso atualizar(Curso curso){
        return cursoRepository.save(curso);
    }

    public Curso getCurso(Integer IdCurso){
        return cursoRepository.getReferenceById(IdCurso);
    }
}
