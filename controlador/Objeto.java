/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Vitor
 */
public class Objeto {

    private String nomeRemetente;
    private String enderecoRemetente ;
    private String nomeDestinatario;
    private String dataDeposito;
    private String peso;
    private String codLocalizador;

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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCodLocalizador() {
        return codLocalizador;
    }

    public void setCodLocalizador(String codLocalizador) {
        this.codLocalizador = codLocalizador;
    }

    

    
public String paraString(){
        return  getNomeRemetente() + " | " + getEnderecoRemetente() + " | " + getNomeDestinatario() + " | " + getDataDeposito() + " | " +getPeso() + " | " + getCodLocalizador(); 
    }
}
