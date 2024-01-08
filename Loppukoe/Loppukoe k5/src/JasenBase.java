public abstract class JasenBase {
    protected String jasenseura;
    protected int vakuutusnro;

    public JasenBase(String jasenseura, int vakuutusnro) {
        this.jasenseura = jasenseura;
        this.vakuutusnro = vakuutusnro;
    }

    public abstract void tulostaJasenTiedot();
}

