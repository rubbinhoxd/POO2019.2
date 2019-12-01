/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.model;

import java.util.Date;

/**
 *
 * @author Rubens
 */
public class Emprestimo {
    
    private int numeroEmprestimo;
    private Livro livro;
    private Aluno aluno;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean renovacao;
    
    
    public int getNumeroEmprestimo() {
        return numeroEmprestimo;
    }

    public void setNumeroEmprestimo(int numeroEmprestimo) {
        this.numeroEmprestimo = numeroEmprestimo;
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isRenovacao() {
        return renovacao;
    }

    public void setRenovacao(boolean renovacao) {
        this.renovacao = renovacao;
    }
    
    
    
    
    
    
    
}
