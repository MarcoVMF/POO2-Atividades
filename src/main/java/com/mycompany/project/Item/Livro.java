/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Item;

/**
 *
 * @author alunos
 */
public class Livro extends Item{
    protected String nome;
    protected String editora;

    public Livro(String nome, String editora, int codigoInt, Boolean estaEmprestado) {
        super(codigoInt, estaEmprestado);
        this.nome = nome;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
