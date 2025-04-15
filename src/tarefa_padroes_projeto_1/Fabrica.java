package tarefa_padroes_projeto_1;

public abstract class Fabrica {
    public Carro cria(String nota){
        Carro carro=selecionaCarro(nota);
        carro=vendeCarro(carro);
        return carro;

    }
    private Carro selecionaCarro(Carro carro){
        carro.imprimeModelo();
        carro.imprimePlaca();
        return carro;
    }
    abstract Carro vendeCarro(Carro carro);
}
