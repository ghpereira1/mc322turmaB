package com.mycompany.mc3221s2023.lab03;
import java.util.ArrayList;
public class Cliente {
    private String nome;
    private String endereco;
    ArrayList<Veiculo> veiculo;
    
    public Cliente(String nome, String endereco, ArrayList veiculo) {
        this.nome = nome;
        this.endereco = endereco;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(ArrayList veiculo) {
        this.veiculo = veiculo;
    }
}
