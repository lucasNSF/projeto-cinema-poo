import java.util.HashMap;

public class Cinema {
    private String nome;
    private Sessao sessao;
    private final HashMap<String, Sala> salas;

    public Cinema(String nome) {
        this.nome = nome;
        this.salas = new HashMap<>();
    }

    public void reservarSala() {

    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
