public abstract class Sala {
    private String nome;
    private int qtdLugares;
    private int qtdPessoas;
    private final Bilhete bilhetes;

    public Sala(String nome, int qtdLugares, float preco) {
        this.nome = nome;
        this.qtdLugares = qtdLugares;
        this.qtdPessoas = 0;
        this.bilhetes = new Bilhete(preco);
    }

    public void reservarCadeira() {
        if (this.getQtdLugares() == 0) {
            System.out.println("A sala está cheia!");
        } else {
            this.setQtdLugares(this.getQtdLugares() - 1);
            this.getBilhetes().setBilhetesVendidos(this.getBilhetes().getBilhetesVendidos() + 1);
            this.setQtdPessoas(this.getQtdPessoas() + 1);
            System.out.println("Lugar na sala " + this.getNome() + " reservado!");
        }
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public Bilhete getBilhetes() {
        return bilhetes;
    }
}
