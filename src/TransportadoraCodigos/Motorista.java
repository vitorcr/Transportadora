/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportadoraCodigos;

import java.util.Date;

public class Motorista {

    private String nome = "";
    private String dataNascimento;
    private String endereco = "";
    private String tipoCNH = "";
    private int numCNH = 0;
    private Veiculo veiculo = null;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoCNH() {
        return tipoCNH;
    }

    public void setTipoCNH(String tipoCNH) {
        this.tipoCNH = tipoCNH;
    }

    public int getNumCNH() {
        return numCNH;
    }

    public void setNumCNH(int numCNH) {
        this.numCNH = numCNH;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
