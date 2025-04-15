package tarefa_padroes_projeto_1;

public class CriaCliente {
    public static void main(String[] args) {
     Cliente cliente = new Cliente("B", true);
     Fabrica fabrica= getFactory(cliente);
     Carro carro=fabrica.cria(cliente.getNota());
     carro.imprimeModelo();
    }
    private static Fabrica getFactory(Cliente cliente) {
        if(cliente.temContrato()){
            return new ContratoFabrica();
        } else{
            return new SemContrato();
        }
    }
}
