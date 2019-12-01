/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfacee;

import br.com.ufc.exception.ENEException;
import br.com.ufc.exception.LJEException;
import br.com.ufc.exception.EJRException;
import br.com.ufc.exception.LLUException;
import br.com.ufc.model.Emprestimo;

/**
 *
 * @author Rubens
 */
public interface EmprestimoI {
        public void emprestarLivro(Emprestimo emprestimo)throws LJEException, LLUException;
        public void devolverLivro(int idEmprestimo) throws ENEException;
        public Emprestimo buscarEmprestimo(int numeroEmprestimo) throws ENEException;
        public void renovarEmprestimo(Emprestimo emprestimo)throws EJRException, ENEException;
}
