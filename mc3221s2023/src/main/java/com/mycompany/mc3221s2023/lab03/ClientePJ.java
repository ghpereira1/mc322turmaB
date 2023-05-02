package com.mycompany.mc3221s2023.lab03;
import java.util.*;
public class ClientePJ extends Cliente{
    private final String CNPJ;
    Date dataFundacao;

    public ClientePJ(String CNPJ, Date dataFundacao, String nome, String endereco, ArrayList veiculo) {
        super(nome, endereco, veiculo);
        this.CNPJ = CNPJ;
        this.dataFundacao = dataFundacao;
    }
    
    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString() {
        return "ClientePJ{" + "CNPJ=" + CNPJ + ", dataFundacao=" + dataFundacao + '}';
    }
    
    public boolean verificarCNPJ(String cnpj) {
        // Remove caracteres não numéricos
        cnpj = cnpj.replaceAll("[^0-9]", "");
        // Verifica se o CNPJ possui 14 dígitos
        if (cnpj.length() != 14)
            return false;
        // Calcula o primeiro dígito verificador
        int soma = 0;
        int peso = 2;
        for (int i = 11; i >= 0; i--) {
            int num = Character.getNumericValue(cnpj.charAt(i));
            soma += num * peso;
            peso = (peso + 1) % 9 + 2;
        }
        int dv1 = (soma % 11) < 2 ? 0 : 11 - (soma % 11);
        // Calcula o segundo dígito verificador
        soma = 0;
        peso = 2;
        for (int i = 12; i >= 0; i--) {
            int num = Character.getNumericValue(cnpj.charAt(i));
            soma += num * peso;
            peso = (peso + 1) % 9 + 2;
        }
        int dv2 = (soma % 11) < 2 ? 0 : 11 - (soma % 11);
        // Verifica se os dígitos verificadores estão corretos
        return dv1 == Character.getNumericValue(cnpj.charAt(12)) &&
               dv2 == Character.getNumericValue(cnpj.charAt(13));
    }
}
