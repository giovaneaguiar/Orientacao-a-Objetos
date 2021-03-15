/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
public class ContatoFornece {
    private String nome;
    private String telefone;
    private String anotacoes;

    public ContatoFornece (String nome, String telefone, String anotacoes){
        this.nome = nome;
        this.telefone = telefone;
        this.anotacoes = anotacoes;
    }
    public ContatoFornece (){
        this.nome = "";
        this.telefone = "";
        this.anotacoes = "";
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
    public String toString(){
        
        return this.nome;
        //metodo de swing para imprimir os contatos
    }

    
}
