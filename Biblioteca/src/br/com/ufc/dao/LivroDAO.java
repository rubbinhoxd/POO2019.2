/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.dao;

import br.com.ufc.exception.LJCException;
import br.com.ufc.exception.LJEException;
import br.com.ufc.exception.LNEException;
import br.com.ufc.interfacee.LivroI;
import br.com.ufc.model.Livro;
import java.util.ArrayList;
/**
 *
 * @author Rubens
 */
import java.util.List;
public class LivroDAO implements LivroI {
    
    private static List<Livro> livros = new ArrayList<Livro>();
    
    public void adicionarLivro(Livro livro) throws LJCException{
        try{
            buscarLivro(livro.getIsbn());
            throw new LJCException();
        } catch(LNEException ex){
             livros.add(livro);
          }
       
    }
    public void removerLivro(int isbn) throws LNEException {
        boolean achou = false;
        for(Livro l : livros) {
            if(l.getIsbn() == isbn) {
                livros.remove(l);
                achou = true;
                break;
            }
        }
        if(!achou) throw new LNEException();
    }
    
    public List<Livro> buscarTodos() throws LNEException{
        if(livros.isEmpty()) throw new LNEException();
        else return livros;
    }
    
    public Livro buscarLivro(int isbn) throws LNEException{
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getIsbn() == isbn)
                return livros.get(i);   
        }
        throw new LNEException();
    }
    
    public Livro buscarPorTitulo(String titulo) throws LNEException{
        for(Livro l : livros) {
            if(l.getTitulo().equals(titulo)) {
                return l;
            }
        }
        throw new LNEException();
    }   
    
    public Livro buscarPorDescricao(String descricao) throws LNEException{
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getDescricao().equals(descricao))
                return livros.get(i);   
        }
        throw new LNEException();
    }      
    
}