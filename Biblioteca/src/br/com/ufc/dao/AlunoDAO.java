/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.dao;

import br.com.ufc.exception.AJCException;
import br.com.ufc.exception.ANEException;
import br.com.ufc.interfacee.AlunoI;
import br.com.ufc.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rubens
 */
public class AlunoDAO implements AlunoI {
    
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void adicionarAluno(Aluno aluno) throws AJCException{
      try{
          buscarAluno(aluno.getMatricula());
          throw new AJCException();
      }catch(ANEException ex){
          alunos.add(aluno);
      }
    }

    @Override
    public void removerAluno(int matricula) throws ANEException {
        boolean achou = false;
        for(Aluno a : alunos) {
            if(a.getMatricula() == matricula) {
                achou = true;
                alunos.remove(a);
                break;
            }
        }
        if(!achou) throw new ANEException();
    }

    @Override
    public Aluno buscarAluno(int matricula) throws ANEException{
        for(int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getMatricula() == matricula){
                return alunos.get(i);
            }
        }
        throw new ANEException();
    }
    
    @Override
    public List<Aluno> buscarTodos() throws ANEException{
        if(alunos.isEmpty()) throw new ANEException();
        else return alunos;
    }
}
