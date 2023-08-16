/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Item;

/**
 *
 * @author alunos
 */
public abstract class Item {
    protected int codigoInt;
    protected Boolean estaEmprestado;
    
    public Item(int codigoInt, Boolean estaEmprestado) {
        this.codigoInt = codigoInt;
        this.estaEmprestado = estaEmprestado;
    }
    
    public int getCodigoInt() {
        return codigoInt;
    }

    public void setCodigoInt(int codigoInt) {
        this.codigoInt = codigoInt;
    }

    public Boolean getEstaEmprestado() {
        return estaEmprestado;
    }

    public void setEstaEmprestado(Boolean estaEmprestado) {
        this.estaEmprestado = estaEmprestado;
    }
}
