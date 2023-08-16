/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Usuario;
/**
 *
 * @author alunos
 */
public class AssistenteAdministrativo extends Usuario{
    
    protected String inicioContrato;
    protected String fimContrato;

    public AssistenteAdministrativo(String inicioContrato, String fimContrato, int codigoUsurio, String nome, String cpf, String email) {
        super(codigoUsurio, nome, cpf, email);
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }

    @Override
    public String toString() {
        return "AssistenteAdministrativo{" + "inicioContrato=" + inicioContrato + ", fimContrato=" + fimContrato + '}';
    }
    
    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(String fimContrato) {
        this.fimContrato = fimContrato;
    }
    
    
    
}
