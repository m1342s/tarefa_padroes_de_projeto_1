package tarefa_padroes_projeto_1;

public class Cliente {
    private String nota;
    private boolean temContrato;

    public Cliente(String nota, Boolean temContrato) {
        this.nota = nota;
        this.temContrato = temContrato;

    }

    public boolean temContrato() {
        return temContrato;
    }

    ;

    public String getNota() {
        return nota;
    }
}

