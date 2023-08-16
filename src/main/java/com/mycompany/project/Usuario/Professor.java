/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Usuario;

/**
 *
 * @author alunos
 */
public class Professor extends Usuario{
    protected String titulacao;

    public Professor(String titulacao, int codigoUsurio, String nome, String cpf, String email) {
        super(codigoUsurio, nome, cpf, email);
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Professor{" + "titulacao=" + titulacao + '}';
    }
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }   
}
