/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.Biblioteca;
import com.mycompany.project.Emprestimo.Emprestimo;
import com.mycompany.project.Item.Item;
import com.mycompany.project.Item.Livro;
import com.mycompany.project.Item.Notebook;
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
            for(int i=0;i<usuarios.length;i++){
                if(emprestimo.getCodigoUsuario() == usuarios[i].getCodigoUsurio()){
                    emprestimos[cont] = emprestimo;
                    cont++;
                }
            }
        }
    }

    public void imprimirTodosEmprestimos(){
        for(int i = 0;i<cont;i++){
            System.out.println("=======================");
            for(Usuario usuario : usuarios){
                if(usuario.getCodigoUsurio() == emprestimos[i].getCodigoUsuario()){
                    System.out.println("Nome do usuário:" +usuario.getNome());
                }
            }
            System.out.println("Codigo do usuário:" +emprestimos[i].getCodigoUsuario());
            System.out.println("Codigo do emprestimo:" +emprestimos[i].getCodigoEmprestimo());
            System.out.println("Data do emprestimo:" +emprestimos[i].getDataEmprestimo());
            System.out.println("Data da devolucao:" +emprestimos[i].getDataDevolucao());
            for(int j=0;j<emprestimos[i].getItensDoEmprestimo().length;j++){
                if(emprestimos[i].getItensDoEmprestimo()[j] instanceof Livro){
                    System.out.println("LIVRO:");
                    System.out.println("Nome do Livro:" +((Livro) emprestimos[i].getItensDoEmprestimo()[j]).getNome());
                    System.out.println("Nome da Editora:" +((Livro) emprestimos[i].getItensDoEmprestimo()[j]).getEditora());
                }else{
                    System.out.println("NOTEBOOK:");
                    System.out.println("Marca:" +((Notebook) emprestimos[i].getItensDoEmprestimo()[j]).getMarca());
                    System.out.println("Modelo:" +((Notebook) emprestimos[i].getItensDoEmprestimo()[j]).getModelo());
                    System.out.println("Processador:" +((Notebook) emprestimos[i].getItensDoEmprestimo()[j]).getProcessador());
                }
            }
            System.out.println("=======================");
        }        
    }
    
    public void imprimirEmprestimosUsuarios(int codigoUsuario){
        for(Usuario usuario : usuarios){
            if(usuario.getCodigoUsurio() == codigoUsuario){
                System.out.println("Emprestimos do " +usuario.getNome() + " são:");
            }
        }
        for(int i = 0;i<this.cont;i++){
            if(emprestimos[i].getCodigoUsuario() == codigoUsuario){
                System.out.println("Itens do Emprestimo:");
                for(Item item : emprestimos[i].getItensDoEmprestimo()){
                    if(item instanceof Livro){
                        System.out.println("Nome do Livro: " +((Livro) item).getNome());
                        System.out.println("Editora do Livro: "+((Livro) item).getEditora());
                    }else{
                        System.out.println("Marca do notebook: "+ ((Notebook) item).getMarca());
                        System.out.println("Modelo do notebook: "+ ((Notebook) item).getModelo());
                        System.out.println("Processador do notebook: "+ ((Notebook) item).getProcessador());
                    }
                }
                System.out.println("Data de Emprestimo:" +emprestimos[i].getDataEmprestimo());
                System.out.println("Data de Devolução:" +emprestimos[i].getDataDevolucao());
                System.out.println("Codigo do Emprestimo:"+emprestimos[i].getCodigoEmprestimo());
            }
        }
    }
    
    public void imprimirLivrosEmprestados(){
        System.out.println("Os livros emprestados são:");
        for(int i=0;i<cont;i++){
            for(int j=0;j<emprestimos[i].getItensDoEmprestimo().length;j++){
                if(emprestimos[i].getItensDoEmprestimo()[j] instanceof Livro){
                    for(Usuario usuario : usuarios){
                        if(usuario.getCodigoUsurio() == emprestimos[i].getCodigoUsuario()){
                            System.out.println("Nome do usuário:" +usuario.getNome());

                        }
                    }
                    System.out.println("Nome do Livro:" +((Livro) emprestimos[i].getItensDoEmprestimo()[j]).getNome());
                    System.out.println("Nome da Editora:" +((Livro) emprestimos[i].getItensDoEmprestimo()[j]).getEditora());
                    System.out.println("");
                }
            }
        }
    }
    public void imprimirNotebooksEmprestados(){
        System.out.println("Os notebooks emprestados são:");
        for(int i=0;i<cont;i++){
            for(int j=0;j<emprestimos[i].getItensDoEmprestimo().length;j++){
                if(emprestimos[i].getItensDoEmprestimo()[j] instanceof Notebook){
                    for(Usuario usuario : usuarios){
                        if(usuario.getCodigoUsurio() == emprestimos[i].getCodigoUsuario()){
                            System.out.println("Nome do usuário:" +usuario.getNome());
                        }
                    }
                    System.out.println("Marca:" +((Notebook) emprestimos[i].getItensDoEmprestimo()[j]).getMarca());
                    System.out.println("Modelo:" +((Notebook) emprestimos[i].getItensDoEmprestimo()[j]).getModelo());
                    System.out.println("Processador:" +((Notebook) emprestimos[i].getItensDoEmprestimo()[j]).getProcessador());
                }
            }
        }
    }

    public Emprestimo[] getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimo[] emprestimos) {
        this.emprestimos = emprestimos;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
}
