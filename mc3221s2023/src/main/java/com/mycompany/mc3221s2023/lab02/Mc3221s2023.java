package com.mycompany.mc3221s2023.lab02;
import java.util.Scanner;
public class Mc3221s2023 {
    public static void main(String[] args) {
        Scanner seguradora = new Scanner(System.in);
        System.out.println("Cadastre sua seguradoura!");
        System.out.print("Digite o nome da seguradora: ");
        String seguradoraNome = seguradora.nextLine();
        System.out.print("Digite o telefone da seguradora: ");
        String seguradoraTelefone = seguradora.nextLine();
        System.out.print("Digite o email da seguradora: ");
        String seguradoraEmail = seguradora.nextLine();
        System.out.print("Digite o endereço da seguradora: ");
        String seguradoraEndereco = seguradora.nextLine();
        Seguradora s = new Seguradora(seguradoraNome, seguradoraTelefone, seguradoraEmail, seguradoraEndereco);
        String seguradoraInfo = s.toString();
        System.out.println("Bem vindo a Seguradora " + seguradoraNome + "!");
        int caso;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite o número do que você deseja fazer:\n1 - Cadastrar cliente\n2 - Cadastrar carro\n3 - \n4 - Ver informações da seguradora");
        caso = entrada.nextInt();
        
        switch (caso){
            case 1:
                Scanner entrada1 = new Scanner(System.in);
                Scanner anos = new Scanner(System.in);
                System.out.print("Digite o nome do cliente: ");
                String nome = entrada1.nextLine();
                System.out.print("Digite o cpf do cliente: ");
                String cpf = entrada1.nextLine();
                System.out.print("Digite a data de nascimento do cliente: ");
                String dataNasc = entrada1.nextLine();
                System.out.print("Digite a idade do Cliente: ");
                int idade = anos.nextInt();
                System.out.print("Digite o endereço do cliente: ");
                String endereco = entrada1.nextLine();
                Cliente c = new Cliente(nome, cpf, dataNasc, idade, endereco);
                boolean isCPF;
                isCPF = Cliente.validarCPF(c.getCpf());
                if (isCPF){
                    String infoC;
                    infoC = c.toString();
                    System.out.println("Cadastro Realizado com sucesso!");
                    System.out.println(infoC);
                }
                else{
                    System.out.println("CPF inválido!\nInforme um CPF válido para prosseguir com o cadastro.");
                }
                break;
            case 2:
                Scanner infoVei = new Scanner(System.in);
                System.out.print("Digite a placa do carro: ");
                String placa = infoVei.nextLine();
                System.out.print("Digiete a marca do carro: ");
                String marca = infoVei.nextLine();
                System.out.print("Digite o modelo do carro: ");
                String modelo = infoVei.nextLine();
                Veiculo v = new Veiculo(placa, marca, modelo);
                System.out.println("Veículo cadastrado com sucesso!");
                String infoV = v.toString();
                System.out.println(infoV);
                break;
            case 3:

                break;
            case 4:
                System.out.print(seguradoraInfo);
                break;
        }
        
    }
}
