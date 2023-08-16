/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.project.Emprestimo;

import com.mycompany.project.Item.Item;

/**
 *
 * @author alunos
 */
public class Emprestimo {
    private int codigoEmprestimo;
    private int codigoUsuario;
    private Item itensDoEmprestimo[];
    private String dataEmprestimo;
    private String dataDevolucao;
    private final int MAX = 100;

    public Emprestimo(int codigoEmprestimo, int codigoUsuario, String dataEmprestimo, String dataDevolucao) {
        this.codigoEmprestimo = codigoEmprestimo;
        this.codigoUsuario = codigoUsuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    
    public Emprestimo(){
        this.itensDoEmprestimo = new Item[MAX];
    }
    
}
