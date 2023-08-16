/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Item;

/**
 *
 * @author alunos
 */
public class Notebook extends Item{
    protected String modelo;
    protected String marca;
    protected String processador;

    public Notebook(String modelo, String marca, String processador, int codigoInt, Boolean estaEmprestado) {
        super(codigoInt, estaEmprestado);
        this.modelo = modelo;
        this.marca = marca;
        this.processador = processador;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    
}
