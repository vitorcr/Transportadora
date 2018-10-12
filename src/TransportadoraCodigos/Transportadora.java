package TransportadoraCodigos;

import javax.swing.JOptionPane;

public class Transportadora {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        int menu = 1;

        while (menu < 124) {

            menu = Integer.parseInt(JOptionPane.showInputDialog(" ======= Transportadora ======= "
                    + "\n 1 - Cadastrar Objeto. "
                    + "\n 2 - Ver Objetos. "
                    + "\n 3 - Cadastrar Motorista. "
                    + "\n 4 - Ver Motoristas. "
                    + "\n 5 - Cadastrar Veículo "
                    + "\n 6 - Ver Veículos "
                    + "\n 123 - Sair. "));

            switch (menu) {
                case 1:
                    sistema.cadastrarObjeto(sistema.solicitaObjeto());
                    break;

                case 2:
                    sistema.verObjeto();
                    break;

                case 3:
                    sistema.cadastrarMotorista(sistema.solicitaMotorista());
                    break;

                case 4:
                    sistema.verMotorista();

                    break;
                    
                case 5:
                    sistema.cadastrarVeiculo(sistema.solicitaVeiculo());

                    break;

                case 6:
                    sistema.verVeiculo();
                    break;

                case 123:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Você digitou um comando inválido!");
                    menu = 1;
                    break;

            }

        }
    }

}
