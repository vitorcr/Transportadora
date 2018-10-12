/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editora.
 */
package TransportadoraCodigos;

import java.util.ArrayList;
import java.util.List;

public class Carga {

    /*
    Cria um ArrayList que armazenará todos os objetos cadastrados no dia.
     */
    public List<Objeto> cargaDia = new ArrayList<Objeto>();

    public void adicionarObj(Objeto obj) {

        cargaDia.add(obj);
    }

    public void verObjetos() {

        Objeto obj = cargaDia.get(0);
        System.out.println("======= Informações do Objeto =======");
        System.out.println("Nome Remetente: " + obj.getNomeRemetente());
        System.out.println("Endereço Remetente: " + obj.getEnderecoRemetente());
        System.out.println("Nome Destinatário: " + obj.getNomeDestinatario());
        System.out.println("Data do despósito: " + obj.getDataDeposito());
        System.out.println("Peso: " + obj.getPeso());
        System.out.println("Cod. localizador: " + obj.getCodLocalizador());
        System.out.println("=====================================");

    }

    /*
    Deverá ser feito uma validação para checar quando a cargaDia tiver menos
    objetos do que o total da carga do veículo.
     */
    public void gerarCargaVeiculo(Veiculo veiculo) {

        Objeto cargaVeiculo[] = new Objeto[veiculo.getCapacidade()];

        for (int i = 0; i == veiculo.getCapacidade(); i++) {

            cargaVeiculo[i] = cargaDia.get(i);
            cargaDia.remove(i);

        }
        veiculo.setCargaVeiculo(cargaVeiculo);

    }
}
