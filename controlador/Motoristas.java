/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author John
 */
public class Motoristas {
    private String nome_motorista;
    private String data_nascimento_motorista;
    private String endereco;
    private String tipo_cnh;
    private String num_cnh;

    public String getNome_motorista() {
        return nome_motorista;
    }

    public void setNome_motorista(String nome_motorista) {
        this.nome_motorista = nome_motorista;
    }

    public String getData_nascimento_motorista() {
        return data_nascimento_motorista;
    }

    public void setData_nascimento_motorista(String data_nascimento_motorista) {
        this.data_nascimento_motorista = data_nascimento_motorista;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo_cnh() {
        return tipo_cnh;
    }

    public void setTipo_cnh(String tipo_cnh) {
        this.tipo_cnh = tipo_cnh;
    }

    public String getNum_cnh() {
        return num_cnh;
    }

    public void setNum_cnh(String num_cnh) {
        this.num_cnh = num_cnh;
    }
    

    
    
    public String paraString(){
        return  getNome_motorista() + " | " +getData_nascimento_motorista() + " | " + getEndereco() + " | " + getTipo_cnh() +"-"+getNum_cnh(); 
    }
}
