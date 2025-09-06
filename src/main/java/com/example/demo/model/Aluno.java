package com.example.demo.model;

public class Aluno {

  private Long id;
  private String nome;
  private String curso;

  public Aluno(long id, String nome, String curso) {
    this.id = id;
    this.nome = nome;
    this.curso = curso;
  }

  public Long getId() {
    return id;
  }

  public Long setId(Long id) {
    return this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public String setNome(String nome) {
    return this.nome = nome;
  }

  public String getCurso() {
    return curso;
  }

  public String setCurso(String curso) {
    return this.curso = curso;
  }

}
