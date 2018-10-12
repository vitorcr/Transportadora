/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportadoraCodigos;

import java.util.ArrayList;
import java.util.List;

public class Empregados {

    public List<Motorista> empregados = new ArrayList<Motorista>();

    public void adicionarMotorista(Motorista motorista) {

        empregados.add(motorista);
    }

    public void verMotoristas() {

        Motorista motorista = empregados.get(0);
        System.out.println("======= Informações do Objeto =======");
        System.out.println("Nome Motorista: " + motorista.getNome());
        System.out.println("Data de Nascimento: " + motorista.getDataNascimento());
        System.out.println("Endereço: " + motorista.getEndereco());
        System.out.println("Tipo de CNH: " + motorista.getTipoCNH());
        System.out.println("Numero da CNH: " + motorista.getNumCNH());
        System.out.println("Está dirigindo o veículo: " + motorista.getVeiculo());
        System.out.println("=====================================");

    }
}
