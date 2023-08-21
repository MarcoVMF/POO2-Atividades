/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Emprestimo;

import com.mycompany.project.Biblioteca.Biblioteca;
import com.mycompany.project.Item.Item;
import com.mycompany.project.Usuario.Aluno;
import com.mycompany.project.Usuario.Professor;
import com.mycompany.project.Usuario.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    private final int MAX = 10;
    private int cont;


    public Emprestimo(int codigoEmprestimo, int codigoUsuario, String dataEmprestimo, Biblioteca b, Item i[]){
        this.itensDoEmprestimo = i;
        for(Item item : i){
            item.setEstaEmprestado(false);
        }
        this.codigoEmprestimo = codigoEmprestimo;
        this.codigoUsuario = codigoUsuario;
        this.dataEmprestimo = dataEmprestimo;
        for(int j=0;j<b.getUsuarios().length;j++){
            if(b.getUsuarios()[j].getCodigoUsurio() == codigoUsuario){
                calcularDataDevolucao(b.getUsuarios()[j], dataEmprestimo);
            }
        }
    }

    public void calcularDataDevolucao(Usuario usuario, String dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDevolucao = LocalDate.parse(dataEmprestimo, formato);
        if(usuario instanceof Aluno){
            dataDevolucao = dataDevolucao.plusDays(7);
            String devolucao = dataDevolucao.format(formato);
            this.dataDevolucao = devolucao;
        }else if(usuario instanceof Professor){
            dataDevolucao = dataDevolucao.plusDays(14);
            String devolucao = dataDevolucao.format(formato);
            this.dataDevolucao = devolucao;
        }else{
            dataDevolucao = dataDevolucao.plusDays(10);
            String devolucao = dataDevolucao.format(formato);
            this.dataDevolucao = devolucao;
        }
    }

    public int getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Item[] getItensDoEmprestimo() {
        return itensDoEmprestimo;
    }

    public void setItensDoEmprestimo(Item[] itensDoEmprestimo) {
        this.itensDoEmprestimo = itensDoEmprestimo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimo(){
        this.itensDoEmprestimo = new Item[MAX];
    }
    
}
