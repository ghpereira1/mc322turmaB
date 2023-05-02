package com.mycompany.mc3221s2023.lab02;
public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private int idade;
	private String endereco;
	
	public Cliente(String nome, String cpf, String dataNascimento, int idade, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
        
        public static boolean validarCPF(String cpf) {
            // Removendo todos os caracteres não inteiros
            cpf = cpf.replaceAll("\\D", "");
            // Verificando se o CPF possui 11 dígitos
            if (cpf.length() != 11) {
                return false;
            }
            // Verificando se todos os dígitos são iguais
            boolean todosDigitosIguais = true;
            for (int i = 1; i < 11; i++) {
                if (cpf.charAt(i) != cpf.charAt(0)) { //charAt retorna o caractere do index indicado
                    todosDigitosIguais = false;
                    break;
                }
            }
            if (todosDigitosIguais) {
                return false;
            }
            // Calculando o primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (10 - i) * (cpf.charAt(i) - '0');
            }
            int primeiroDigito = 11 - (soma % 11);
            if (primeiroDigito >= 10) {
                primeiroDigito = 0;
            }
            // Verificando o primeiro dígito verificador
            if (primeiroDigito != cpf.charAt(9) - '0') {
                return false;
            }
            // Calculando o segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (11 - i) * (cpf.charAt(i) - '0');
            }
            int segundoDigito = 11 - (soma % 11);
            if (segundoDigito >= 10) {
                segundoDigito = 0;
            }
            // Verificando o segundo dígito verificador
            if (segundoDigito != cpf.charAt(10) - '0') {
                return false;
            }
            return true;
        }

    @Override
    public String toString() {
        return "=====Cliente=====\n" + "nome: " + nome + "\ncpf: " + cpf + "\ndataNascimento: " + dataNascimento + "\nidade: " + idade + "\nendereco: " + endereco;
    }
}
