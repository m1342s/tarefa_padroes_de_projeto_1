package tarefa_padroes_projeto_1;

public abstract class Carro {
    private String placa;
    private String modelo;
    private String cor;

    public Carro(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }
    public void imprimePlaca() {
        System.out.println("Placa: " + placa);
    }
    public void imprimeModelo() {
        System.out.println("Modelo: " + modelo);
    }
}
