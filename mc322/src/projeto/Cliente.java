package projeto;
// Token: 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
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
                if (cpf.charAt(i) != cpf.charAt(0)) {
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
            int digito1 = 11 - (soma % 11);
            if (digito1 >= 10) {
                digito1 = 0;
            }
            // Verificando o primeiro dígito verificador
            if (digito1 != cpf.charAt(9) - '0') {
                return false;
            }
            // Calculando o segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (11 - i) * (cpf.charAt(i) - '0');
            }
            int digito2 = 11 - (soma % 11);
            if (digito2 >= 10) {
                digito2 = 0;
            }
            // Verificando o segundo dígito verificador
            if (digito2 != cpf.charAt(10) - '0') {
                return false;
            }
            return true;
        }
}
