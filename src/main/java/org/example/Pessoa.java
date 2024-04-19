package org.example;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private Integer anoNascimento;
    private String cpf;

    public Pessoa(String nome, Integer anoNascimento, String cpf) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    //REGRA DE NEGÓCIO: NOME NÃO PODE TER MENOS QUE 4 LETRAS
    public void setNome(String nome) {
        if(nome.length() >= 4){
            this.nome = nome;
        }else{
            throw new RuntimeException("Número minímo de caracteres 4.");
        }
        
    }
    
    //MÉTODO QUE VALIDE SE É MAIOR DE IDADE
    public boolean isMaiorIdade(){
        return getIdade() >= 18;
    }

    private int getIdade() {
        return LocalDate.now().getYear() - anoNascimento;
    }
}
