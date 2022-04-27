public class Bilhete {
    private float preco;
    private int bilhetesVendidos;

    public Bilhete(float preco) {
        this.bilhetesVendidos = 0;
        this.preco = preco;
    }

    public float getLucro() {
        return this.getPreco() * this.getBilhetesVendidos();
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getBilhetesVendidos() {
        return bilhetesVendidos;
    }

    public void setBilhetesVendidos(int bilhetesVendidos) {
        this.bilhetesVendidos = bilhetesVendidos;
    }
}
