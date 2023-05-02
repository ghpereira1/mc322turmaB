package com.mycompany.mc3221s2023.lab03;
import java.util.ArrayList;
public class Seguradora {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    ArrayList<Sinistro> listaSinistro;
    ArrayList<Cliente> listaClientes;

    public Seguradora(String nome, String telefone, String email, String endereco, ArrayList listaSinistro, ArrayList listaClientes) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.listaSinistro = listaSinistro;
        this.listaClientes = listaClientes;
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

    public ArrayList getListaSinistro() {
        return listaSinistro;
    }

    public void setListaSinistro(ArrayList listaSinistro) {
        this.listaSinistro = listaSinistro;
    }

    public ArrayList getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "Seguradora{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + '}';
    }

    public boolean cadastrarCliente(Cliente cliente){
        int tam = listaClientes.size();
        listaClientes.add(cliente);
        if(tam == listaClientes.size() - 1){
            System.out.println("Cliente inserido!");
            return true;
        }
        else{
            System.out.println("Tipo de cliente invalido");
            return false;
        }
    }
    
    public boolean removerCliente(String nomeRemove){
        // percorre toda a lista e se achar um elemento cujo o nome é o nome desejado para remover
        // ele retira o objeto do array
        for(int i = 0; i < listaClientes.size(); i++){
            if(nomeRemove == null ? listaClientes.get(i).getNome() == null : nomeRemove.equals(listaClientes.get(i).getNome())){
                listaClientes.remove(i);
                System.out.println("Cliente " + nomeRemove + " removido com sucesso!");
            }
        }
        return true;
    }
    
    public void listarClientes(String tipoCliente){
        // percorre a lista e se o objeto da lista e o tipo desejado forem o msm ele printa as info
        // desse elemento no terminal
        for (Cliente cliente : listaClientes) {
            if (cliente instanceof ClientePJ && tipoCliente.equals("PJ")) {
              System.out.println(cliente.toString());
            } else if (cliente instanceof ClientePF && tipoCliente.equals("PF")) {
              System.out.println(cliente.toString());
            }
          }
    }
    
    public boolean gerarSinistro(Sinistro sin){
        
        return true;
    }
    
    public boolean visualizarSinistro(String nome){
        // procura o nome atribuido ao sinistro e printa no terminal
        for (Sinistro sinistro : listaSinistro){
            if (nome.equals(sinistro.cliente.getNome())){
                System.out.println(sinistro.toString());
            }
        }
        return true;
    }
    
    public void listarSinistro(){
        // printa todos os sinistros no terminal
        for (Sinistro sinistro : listaSinistro){
            System.out.println(sinistro.toString());
        }
    }
}
