package controlador;

public class Veiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private String ano;
    private String placa;
    private int capacidade;
    private String carga;
    private String util;

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    
    public String paraString(){
        return  getTipo() + " | " + getMarca() + " | " + getModelo() + " | " + getModelo() + " | " +getAno() + " | " + getPlaca()+ " | " +getCapacidade() + " | " +getCarga() + " | " + getUtil(); 
    }
}

