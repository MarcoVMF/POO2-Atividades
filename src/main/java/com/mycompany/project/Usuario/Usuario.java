/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Usuario;

/**
 *
 * @author alunos
 */
public abstract class Usuario {
    protected int codigoUsurio;
    protected String nome;
    protected String cpf;
    protected String email;

    public Usuario(int codigoUsurio, String nome, String cpf, String email) {
        this.codigoUsurio = codigoUsurio;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigoUsurio=" + codigoUsurio + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + '}';
    }
    
    public void setCodigoUsurio(int codigoUsurio) {
        this.codigoUsurio = codigoUsurio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getCodigoUsurio() {
        return codigoUsurio;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
}
