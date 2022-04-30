public abstract class Sala {
    private String nome;
    private int qtdLugares;
    private float precoBilhete;
    private int qtdBilhetesVendidos;

    public Sala(String nome, int qtdLugares) {
        this.nome = nome;
        this.qtdLugares = qtdLugares;
        this.precoBilhete = 12;
        this.qtdBilhetesVendidos = 0;
    }

    public void reservarCadeira() {
        if (this.getQtdLugares() == 0) {
            System.out.println("A sala está cheia!");
        } else {
            this.setQtdLugares(this.getQtdLugares() - 1);
            this.setQtdBilhetesVendidos(this.getQtdBilhetesVendidos() + 1);
            System.out.println("Lugar na sala " + this.getNome() + " reservado!");
        }
    }

    public float getLucro() {
        return this.getPrecoBilhete() * this.getQtdBilhetesVendidos();
    }

    public float getPrecoBilhete() {
        return precoBilhete;
    }

    public void setPrecoBilhete(float precoBilhete) {
        this.precoBilhete = precoBilhete;
    }

    public int getQtdBilhetesVendidos() {
        return qtdBilhetesVendidos;
    }

    public void setQtdBilhetesVendidos(int qtdBilhetesVendidos) {
        this.qtdBilhetesVendidos = qtdBilhetesVendidos;
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
}
