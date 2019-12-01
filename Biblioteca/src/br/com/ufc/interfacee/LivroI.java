/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfacee;

import br.com.ufc.exception.LJCException;
import br.com.ufc.exception.LNEException;
import br.com.ufc.model.Livro;

/**
 *
 * @author Rubens
 */
public interface LivroI {
        public void adicionarLivro(Livro livro)throws LJCException;
        public void removerLivro(int isbn) throws LNEException;
        public Livro buscarLivro(int isbn) throws LNEException;
}
