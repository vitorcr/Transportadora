package TransportadoraCodigos;

import javax.swing.JOptionPane;
import TransportadoraTelas.TelaCadastroObjeto;

public class Sistema {

    Carga carga = new Carga();
    Garagem garagem = new Garagem();
    Empregados empregados = new Empregados();
    TelaCadastroObjeto telacadastro = new TelaCadastroObjeto();

//=====================================================================OBJETO===
    public Objeto solicitaObjeto() {

        Objeto obj;

        telacadastro.setVisible(true);

        obj = telacadastro.retornaObjeto();

        /* String nomeRmetente = JOptionPane.showInputDialog("Insira o nome do Remetente.");
        String enderecoRemetente = JOptionPane.showInputDialog("Insira o Endereço Remetente.");
        String nomeDestinatario = JOptionPane.showInputDialog("Insira o Nome Destinatário.");
        String dataDeposito = JOptionPane.showInputDialog("Insira a data de deposito no formato dd/MM/yyyy.");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o Peso."));
        int codlocalizador = Integer.parseInt(JOptionPane.showInputDialog("Insira o cod Localizador."));

        Objeto obj = new Objeto();

        obj.setNomeRemetente(nomeRmetente);
        obj.setEnderecoRemetente(enderecoRemetente);
        obj.setNomeDestinatario(nomeDestinatario);
        obj.setDataDeposito(dataDeposito);
        obj.setPeso(peso);
        obj.setCodLocalizador(codlocalizador); */
        
        return obj;
    }

    public void cadastrarObjeto(Objeto obj) {

        carga.adicionarObj(obj);
    }

    public void verObjeto() {
        carga.verObjetos();

    }
//====================================================================VEICULO===

    public Veiculo solicitaVeiculo() {

        Veiculo veiculo = new Veiculo();

        String marca = JOptionPane.showInputDialog("Informe a marca do veículo: ");
        String modelo = JOptionPane.showInputDialog("Informe o modelo do veículo: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
        String placa = JOptionPane.showInputDialog("Informe a placa do veículo: ");
        String tipo = JOptionPane.showInputDialog("Informe o tipo do veículo: " + "\n Van, Caminhão ou Carreta.");

        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setAno(ano);
        veiculo.setPlaca(placa);
        veiculo.setTipo(tipo);

        //===Van===
        if (veiculo.getTipo() == "Van") {
            veiculo.setCapacidade(1);
            veiculo.setCNH("A ou B");
        }
        //===Caminhão===
        if (veiculo.getTipo() == "Caminhão") {
            veiculo.setCapacidade(3);
            veiculo.setCNH("C");
        }
        //===Carreta===
        if (veiculo.getTipo() == "Carreta") {
            veiculo.setCapacidade(10);
            veiculo.setCNH("D");
        }

        return veiculo;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {

        garagem.adicionarVeiculo(veiculo);

    }

    public void verVeiculo() {
        garagem.verVeiculos();
    }
//==================================================================MOTORISTA===

    public Motorista solicitaMotorista() {
        Motorista motorista = new Motorista();

        String nome = JOptionPane.showInputDialog("Informe o Nome: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento no formato dd/MM/yyyy.");
        String endereco = JOptionPane.showInputDialog("Informe o endereço. ");
        String tipoCNH = JOptionPane.showInputDialog("Informe o tipo de CNH. ");
        int numCNH = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da CNH. "));
        Veiculo veiculo = null;

        motorista.setNome(nome);
        motorista.setDataNascimento(dataNascimento);
        motorista.setEndereco(endereco);
        motorista.setTipoCNH(tipoCNH);
        motorista.setNumCNH(numCNH);
        motorista.setVeiculo(veiculo);

        return motorista;
    }

    public void cadastrarMotorista(Motorista motorista) {

        empregados.adicionarMotorista(motorista);
    }

    public void verMotorista() {
        empregados.verMotoristas();

    }

//==============================================================================
    public void separarCarga(Veiculo veiculo) {

        veiculo.gerarCarga();

    }

    public void vincularMotoristaVeiculo(Motorista motorista, Veiculo veiculo) {

        if (veiculo.disponibilidade == true) {

            if (verificaCNH(motorista, veiculo)) {
                motorista.setVeiculo(veiculo);
                veiculo.disponibilidade = false;
            } else {
                JOptionPane.showInputDialog("O motorista não possui CNH nescessária para este tipo de veículo!");
            }

        } else {
            JOptionPane.showInputDialog("O veículo não está disponível!");
        }

    }

    public boolean verificaCNH(Motorista motorista, Veiculo veiculo) {

        if (motorista.getTipoCNH() == veiculo.getCNH()) {
            return true;
        } else {
            return false;
        }
    }

}
