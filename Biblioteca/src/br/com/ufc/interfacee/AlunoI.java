/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.interfacee;

import br.com.ufc.exception.AJCException;
import br.com.ufc.exception.ANEException;
import br.com.ufc.model.Aluno;
import java.util.List;

/**
 *
 * @author Rubens
 */
public interface AlunoI {
    public void adicionarAluno(Aluno aluno) throws AJCException;
    public void removerAluno(int matricula) throws ANEException;
    public Aluno buscarAluno(int matricula) throws ANEException;
    public List<Aluno> buscarTodos() throws ANEException;
    
    
}
