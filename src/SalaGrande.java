public class SalaGrande extends Sala {
    public SalaGrande(String nome) {
        super(nome, 500);
    }

    @Override
    public void reservarCadeira() {
        if (this.getQtdLugares() == 50) {
            System.out.println("A sala grande já atingiu o seu limite!");
            System.out.println("OBS: Deve ser deixado um percentual de 10% de cadeiras livres.");
        } else {
            this.setQtdLugares(this.getQtdLugares() - 1);
            this.setQtdBilhetesVendidos(this.getQtdBilhetesVendidos() + 1);
            System.out.println("Lugar na sala " + this.getNome() + " reservado!");
        }
    }
}
