package com.mycompany.project;

import com.mycompany.project.Biblioteca.Biblioteca;
import com.mycompany.project.Emprestimo.Emprestimo;
import com.mycompany.project.Item.Item;
import com.mycompany.project.Item.Livro;
import com.mycompany.project.Item.Notebook;
import com.mycompany.project.Usuario.*;


public class main {
    public static void main(String [] args){

        Aluno al = new Aluno("Ciencia da Computação", 2023, 1, "Nome1", "12345678", "nome1@email.com");
        Professor pr = new Professor("Doutor", 2, "Nome2", "12345678910", "nome2@email.com");
        AssistenteAdministrativo aa = new AssistenteAdministrativo("19/08/2023", "19/08/2024", 3, "Nome3", "123456", "nome3@email.com");

        Usuario[] usuarios = new Usuario[3];
        usuarios[0] = al;
        usuarios[1] = pr;
        usuarios[2] = aa;

        Livro li1 = new Livro("Odisseia", "Editora 34", 1, false);
        Livro li2 = new Livro("Illieda", "Editora 17", 2, false);
        Livro li3 = new Livro("Os Lusíadas", "Editora 8.5", 3, false);
        Notebook nt = new Notebook("Nitro 5", "Acer", "i5 20 Geração", 4, false);

        Item[] i = new Item[4];
        i[0] = li1;
        i[1] = li2;
        i[2] = li3;
        i[3] = nt;

        Item[] iAl = new Item[1];
        iAl[0] = li1;

        Item[] iPr = new Item[2];
        iPr[0] = li2;
        iPr[1] = nt;

        Item[] iA = new Item[1];
        iA[0] = li3;

        Biblioteca b = new Biblioteca("Biblioteca Presidente Prudente");

        b.setUsuarios(usuarios);
        b.setItens(i);

        Emprestimo epAluno = new Emprestimo(1, 1, "19/08/2023", b, iAl);
        Emprestimo epProfessor = new Emprestimo(2, 2, "19/08/2023", b, iPr);
        Emprestimo epAssistente = new Emprestimo(3, 3, "19/08/2023", b, iA);

        b.addEmprestimo(epAluno);
        b.addEmprestimo(epProfessor);
        b.addEmprestimo(epAssistente);

        b.imprimirTodosEmprestimos();
        System.out.println("==================");
        b.imprimirEmprestimosUsuarios(1);
        System.out.println("==================");
        b.imprimirLivrosEmprestados();
        System.out.println("==================");
        b.imprimirNotebooksEmprestados();
        System.out.println("==================");

    }
}
