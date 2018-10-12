/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportadoraCodigos;

import java.util.ArrayList;
import java.util.List;

public class Garagem {

    public int numVan = 0, numCam = 0, numCar = 0;

    /*
    Cria um ArrayList que armazena todos os veículos cadastrados.
     */
    public List<Veiculo> garagem = new ArrayList<Veiculo>();

    public void adicionarVeiculo(Veiculo veiculo) {

        garagem.add(veiculo);

        if (veiculo.getTipo() == "Van") {
            numVan++;
        }

        if (veiculo.getTipo() == "Caminhao") {
            numCam++;
        }

        if (veiculo.getTipo() == "Carreta") {
            numCar++;
        }

    }

    public void verVeiculos() {

        Veiculo veiculo = garagem.get(0);
        System.out.println("======= Informações do Objeto =======");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Tipo: " + veiculo.getTipo());
        System.out.println("Capacidade: " + veiculo.getCapacidade());
        System.out.println("CNH: " + veiculo.getCNH());
        System.out.println("Disponibilidade: " + veiculo.isDisponibilidade());
        System.out.println("=====================================");

    }

    public void organizaGaragem() {
        /* Cria metodo para organizar a garagem de acordo com o seguintes requisitos:
           Veiculos com maior capacidade de armazenamento primeiro;
         */
    }

}
