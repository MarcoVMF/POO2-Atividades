/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Biblioteca;
import com.my.company.project.Emprestimo.Emprestimo;
import com.mycompany.project.Item.Item;
import com.mycompany.project.Usuario.Usuario;

/**
 *
 * @author alunos
 */
public class Biblioteca {
    private String nome;
    private Emprestimo emprestimos[];
    private Item itens[];
    private Usuario usuarios[];
    private final int MAX = 100;
    private int cont;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.cont = 0;
    }
    
    public Biblioteca(){
        itens = new Item[MAX];
        usuarios = new Usuario[MAX];
        emprestimos = new Emprestimo[MAX];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addEmprestimo(Emprestimo emprestimo){
        if(cont<MAX){
            this.emprestimos[cont] = emprestimo;
            cont++;
        }
    }
    
    public void imprimirTodosEmprestimos(){
        for(int i = 0;i<this.cont;i++){
            System.out.println("");
        }        
    }
    
    public void imprimirEmprestimosUsuarios(int codigoUsuario){
        
    }
    
    public void imprimirLivrosEmprestados(){
        
    }
    
    
    
}
