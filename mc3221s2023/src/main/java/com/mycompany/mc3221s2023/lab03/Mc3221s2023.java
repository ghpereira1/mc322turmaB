package com.mycompany.mc3221s2023.lab03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Mc3221s2023 {
    public static void main(String[] args) throws ParseException {
        ArrayList<Veiculo> vList = new ArrayList<>();
        ArrayList<Veiculo> sList = new ArrayList<>();
        // Criando um veiculo
        System.out.println("Cadastre um veiculo com placa, marca, modelo e ano de fabricacao!");
        Scanner entrada = new Scanner(System.in);
        Scanner entradaINT = new Scanner(System.in);
        String placa = entrada.nextLine();
        String marca = entrada.nextLine();
        String modelo = entrada.nextLine();
        int anoFab = entradaINT.nextInt();
        Veiculo v = new Veiculo(placa, marca, modelo, anoFab);
        vList.add(v);
        
        // Formato da data
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        // Criando os clientes e adicionando num array
        System.out.println("Cadastre um cliente PF com CPF, Genero, Data da liescensa, Educacao, Data de Nascimento, Classe Economica, Nome e Endereco!");
        String cpf = entrada.nextLine();
        String genero = entrada.nextLine();
        String dataL = entrada.nextLine();
        String educacao = entrada.nextLine();
        String dataN = entrada.nextLine();
        String clasEco = entrada.nextLine();
        String nome = entrada.nextLine();
        String endereco = entrada.nextLine();
        
        Date dataLis = formato.parse(dataL);
        Date dataNasc = formato.parse(dataN);
        
        ClientePF c1 = new ClientePF(cpf, genero, dataLis, educacao, dataNasc, clasEco, nome, endereco, vList);
        
        System.out.println("Cadastre um cliente PJ com CNPJ, Data de Fundacao, Nome da Empresa e Endereco!");
        String cnpj = entrada.nextLine();
        String dataF = entrada.nextLine();
        Date dataFun = formato.parse(dataF);
        nome = entrada.nextLine();
        endereco = entrada.nextLine();
        ClientePJ c2 = new ClientePJ(cnpj, dataFun, nome, endereco, vList);
        
        ArrayList<Cliente> cList = new ArrayList<>();
        cList.add(c1);
        cList.add(c2);
        
        // Validando CPF e CNPJ
        c1.validarCPF(cpf);
        c2.verificarCNPJ(cnpj);
        
        // Criando a seguradora
        System.out.println("Crie uma seguradora com Nome, Telefone, Email e Endereco!");
        nome = entrada.nextLine();
        String telefone = entrada.nextLine();
        String email = entrada.nextLine();
        endereco = entrada.nextLine();
        Seguradora seg = new Seguradora(nome, telefone, email, endereco, sList, cList);
        seg.cadastrarCliente(c1);
        seg.cadastrarCliente(c2);
        
        // Criando o sinistro
        System.out.println("Crie um sinistro com Data do ocorrido e Local do ocorrido!");
        String data = entrada.nextLine();
        endereco = entrada.nextLine();
        Sinistro sin = new Sinistro(data, endereco, seg, v, c1);
        seg.listaSinistro.add(sin);
        
        // Usando o toString de todos os objetos
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(v.toString());
        System.out.println(seg.toString());
        System.out.println(sin.toString());
        
        // Chamando os metodos da seguradora
        seg.listarClientes("PJ");
        seg.listarClientes("PF");
        seg.listarSinistro();
        seg.visualizarSinistro(c1.getNome());
        
        // Removendo cliente c2
        seg.removerCliente(c2.getNome());
    }
}
