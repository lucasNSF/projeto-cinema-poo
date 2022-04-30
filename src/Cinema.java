import java.util.HashMap;

public class Cinema {
    private String nome;
    private Sessao sessao;
    private final HashMap<String, Sala> salas;

    public Cinema(String nome) {
        this.nome = nome;
        this.salas = new HashMap<>();
        this.sessao = Sessao.MATUTINA;
    }

    public void cadastrarSala(Sala sala) {
        this.salas.put(sala.getNome(), sala);
        System.out.println("Sala cadastrada com sucesso!");
    }

    public Sala removerSala(Sala sala) {
        if (this.salas.containsValue(sala)) {
            this.salas.remove(sala.getNome());
            System.out.println("Sala removida com sucesso!");
            return sala;
        } else return null;
    }

    public void removerSala(String nomeDaSala) {
        if (this.salas.containsKey(nomeDaSala)) {
            this.salas.remove(nomeDaSala);
            System.out.println("Sala removida com sucesso!");
        }
    }

    public void reservarSala(String nome) {
        if (this.salas.containsKey(nome)) {
            Sala salaReservada = this.salas.get(nome);
            salaReservada.reservarCadeira();
        }
    }

    public void reservarSala(Sala sala) {
        if (this.salas.containsValue(sala)) {
            sala.reservarCadeira();
        }
    }

    public float obterLucro() {
        float lucro = 0;

        for (Sala sala : this.salas.values()) {
            lucro += sala.getLucro();
        }

        return lucro;
    }

    public HashMap<String, Sala> getSalas() {
        return salas;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;

        HashMap<String, Sala> salasMedias = new HashMap<>();
        HashMap<String, Sala> salasPequenas = new HashMap<>();

        for (Sala sala : this.salas.values()) {
            if (sala instanceof SalaMedia) {
                salasMedias.put(sala.getNome(), sala);
            } else if (sala instanceof SalaPequena) {
                salasPequenas.put(sala.getNome(), sala);
            }
        }

        if (this.getSessao() == Sessao.VESPERTINA) {
            salasMedias.forEach((nomeSala, sala) -> sala.setPrecoBilhete(9));
            salasPequenas.forEach((nomeSala, sala) -> sala.setPrecoBilhete(9));
        } else if (this.getSessao() == Sessao.NOTURNA) {
            salasMedias.forEach((nomeSala, sala) -> sala.setPrecoBilhete(12));
            salasPequenas.forEach((nomeSala, sala) -> sala.setPrecoBilhete(9));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
