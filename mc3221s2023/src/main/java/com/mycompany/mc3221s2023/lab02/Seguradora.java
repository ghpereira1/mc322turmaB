package com.mycompany.mc3221s2023.lab02;
public class Seguradora {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	public Seguradora(String nome, String telefone, String email, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

    @Override
    public String toString() {
        return "=====Seguradora=====" + "\nnome: " + nome + "\ntelefone: " + telefone + "\nemail: " + email + "\nendereco: " + endereco;
    }
	
}
