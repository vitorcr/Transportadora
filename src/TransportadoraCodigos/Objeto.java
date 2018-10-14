/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportadoraCodigos;

import java.util.Date;



public class Objeto {

    private String nomeRemetente = "";
    private String enderecoRemetente = "";
    private String nomeDestinatario = "";
    private String dataDeposito;
    private double peso = 0;
    private int codLocalizador = 0;

    public Objeto(Objeto obj) {
        this.nomeRemetente = obj.getNomeRemetente();
        this.enderecoRemetente = obj.getEnderecoRemetente();
        this.nomeDestinatario = obj.getNomeDestinatario();
        this.dataDeposito = obj.getDataDeposito();
        this.peso = obj.getPeso();
        this.codLocalizador = obj.getCodLocalizador();
    }

    public Objeto() {

    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getDataDeposito() {
        return dataDeposito;
    }

    public void setDataDeposito(String dataDeposito) {
        this.dataDeposito = dataDeposito;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCodLocalizador() {
        return codLocalizador;
    }

    public void setCodLocalizador(int codLocalizador) {
        this.codLocalizador = codLocalizador;
    }

}
