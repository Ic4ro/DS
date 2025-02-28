public class Tarefa {

    // Atributos privados
    private String descricao;
    private String status;

    // Construtor
    public Tarefa(String descricao, String status) {
        this.descricao = descricao;
        this.status = status;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método toString para exibir a tarefa
    @Override
    public String toString() {
        return "Tarefa: " + descricao + 
             "\nStatus: " + status;
    }
}
