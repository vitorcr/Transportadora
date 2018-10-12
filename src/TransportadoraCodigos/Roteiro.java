/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportadoraCodigos;

import java.util.Date;

/**
 *
 * @author Vitor
 */
public class Roteiro {

    private Date dataRoteiro;

    public Date getDataRoteiro() {
        return dataRoteiro;
    }

    public void setDataRoteiro(Date dataRoteiro) {
        this.dataRoteiro = dataRoteiro;
    }

    /*
    Métoodo para gerar o roteiro de entraga do caminhão, atualmente está
    armazenando numa string mais será mudado para um arquivo.
    */
    
    public void gerarRoteiroEntrega(Veiculo veiculo) {

        Objeto cargaVeiculo[] = veiculo.getCargaVeiculo();
        Objeto obj;
        String roteiroEntrega = "";

        for (int i = 0; i == veiculo.getCapacidade(); i++) {
            obj = cargaVeiculo[i];
            roteiroEntrega = obj.getEnderecoRemetente() + ", ";
        }

        veiculo.setRoteiroEntrega(roteiroEntrega);
    }

    public void gerarRoteiroObjetosNaoEntregues(Objeto obj, Veiculo veiculo) {

    }

    public void verificaObjFora() {

    }

}
