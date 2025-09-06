
package com.example.demo.controller;


import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
  private final AlunoService alunoService;

  public AlunoController(AlunoService alunoService) {
    this.alunoService = alunoService;
  }

  @GetMapping
  public List<Aluno> listarTodos() {
    return alunoService.listarTodos();
  }

  @GetMapping("/{id}")
  public Aluno buscarPorId(@PathVariable Long id) {
    return alunoService.buscarPorId(id);
  }

  @PostMapping
  public Aluno adicionar(@RequestBody Aluno aluno) {
    return alunoService.adicionar(aluno);
  }

  @PutMapping("/{id}")
  public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
    return alunoService.atualizar(id, aluno);
  }

  @DeleteMapping("/{id}")
  public void remover(@PathVariable Long id) {
    alunoService.remover(id);
  }
}
