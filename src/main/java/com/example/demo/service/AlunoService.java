// import com.example.demo.model.Aluno;
// import java.util.ArrayList;
// import java.util.List;
// import org.springframework.stereotype.Service;
package com.example.demo.service;

import com.example.demo.model.Aluno;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;



@Service
public class AlunoService {
  private List<Aluno> alunos = new ArrayList<>();
  private Long proximoId = 1L;


  public List<Aluno> listarTodos() {
    return alunos;
  }

  public Aluno buscarPorId(Long id) {
    return alunos.stream().filter(aluno -> aluno.getId().equals(id)).findFirst().orElse(null);
  }

  public Aluno adicionar(Aluno aluno) {
    aluno.setId(proximoId++); 
    alunos.add(aluno);
    return aluno;
  }

  public Aluno atualizar(Long id, Aluno alunoAtualizado) {
    Aluno alunoExistente = buscarPorId(id);
    if (alunoExistente != null) {
        alunoExistente.setNome(alunoAtualizado.getNome());
        alunoExistente.setCurso(alunoAtualizado.getCurso());
        return alunoExistente;
    }
    return null;
  }

  public boolean remover(Long id) {
    return alunos.removeIf(aluno -> aluno.getId().equals(id));
  }
}
