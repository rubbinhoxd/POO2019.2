/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.dao;

import br.com.ufc.exception.ENEException;
import br.com.ufc.exception.LJEException;
import br.com.ufc.exception.EJRException;
import br.com.ufc.exception.LLUException;
import br.com.ufc.interfacee.EmprestimoI;
import br.com.ufc.model.Emprestimo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rubens
 */
public class EmprestimoDAO implements EmprestimoI {
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    @Override
    public void emprestarLivro(Emprestimo emprestimo) {
       emprestimos.add(emprestimo);
    }
    
    @Override
    public void devolverLivro(int idEmprestimo) throws ENEException{
        boolean achou = false;
        for(Emprestimo e : emprestimos) {
            if(e.getNumeroEmprestimo() == idEmprestimo) {
                emprestimos.remove(e);
                achou = true;
                break;
            }
        }
        if(!achou) throw new ENEException();
    }    
    @Override
    public Emprestimo buscarEmprestimo(int numeroEmprestimo)throws ENEException{
        for(Emprestimo e : emprestimos) {
            if(e.getNumeroEmprestimo() == numeroEmprestimo) return e;
        }
        throw new ENEException();
    }  
    
    public List<Emprestimo> buscarTodos()throws ENEException{
        if(emprestimos.isEmpty()) throw new ENEException();
        else return emprestimos;
    } 
    
   public void renovarEmprestimo(Emprestimo emprestimo) throws EJRException, ENEException {
        Emprestimo emprestimoo = buscarEmprestimo(emprestimo.getNumeroEmprestimo());
        if(!emprestimoo.isRenovacao()) {
            emprestimoo.setRenovacao(true);
            Date date = emprestimoo.getDataDevolucao();
            date.setDate(date.getDate() + 7);
            emprestimoo.setDataDevolucao(date);
        } else 
            throw new EJRException(); //emprestimo ja renovado
    }
        
}
