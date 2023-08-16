/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Usuario;

/**
 *
 * @author alunos
 */
public class Aluno extends Usuario{
    
    protected String curso;
    protected int ano;

    public Aluno(String curso, int ano, int codigoUsurio, String nome, String cpf, String email) {
        super(codigoUsurio, nome, cpf, email);
        this.curso = curso;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", ano=" + ano + '}';
    }

    
    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getCurso() {
        return curso;
    }

    public int getAno() {
        return ano;
    }
       
}
