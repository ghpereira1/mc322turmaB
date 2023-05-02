package com.mycompany.mc3221s2023.lab03;
import java.util.*;
public class ClientePF extends Cliente{
    private final String CPF;
    private String genero;
    Date dataLicenca;
    private String educacao;
    Date dataNascimento;
    private String classeEconomica;

    public ClientePF(String CPF, String genero, Date dataLicenca, String educacao, Date dataNascimento, String classeEconomica, String nome, String endereco, ArrayList veiculo) {
        super(nome, endereco, veiculo);
        this.CPF = CPF;
        this.genero = genero;
        this.dataLicenca = dataLicenca;
        this.educacao = educacao;
        this.dataNascimento = dataNascimento;
        this.classeEconomica = classeEconomica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataLicenca() {
        return dataLicenca;
    }

    public void setDataLicenca(Date dataLicenca) {
        this.dataLicenca = dataLicenca;
    }

    public String getEducacao() {
        return educacao;
    }

    public void setEducacao(String educacao) {
        this.educacao = educacao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getClasseEconomica() {
        return classeEconomica;
    }

    public void setClasseEconomica(String classeEconomica) {
        this.classeEconomica = classeEconomica;
    }

    public boolean validarCPF(String cpf) {
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
        return "ClientePF{" + "CPF=" + CPF + ", genero=" + genero + ", dataLicenca=" + dataLicenca + ", educacao=" + educacao + ", dataNascimento=" + dataNascimento + ", classeEconomica=" + classeEconomica + '}';
    }

}
