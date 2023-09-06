public class CuentaCorriente extends CuentaBancaria{
    private String Lsobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, double lineaSobregiro) {



    }

    public String getLsobregiro() {
        return Lsobregiro;
    }

    public void setLsobregiro(String lsobregiro) {
        Lsobregiro = lsobregiro;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "Lsobregiro='" + Lsobregiro + '\'' +
                '}';
    }

    public CuentaCorriente(String nrotarjeta, String fechaapertura, int saldo, String fechavenc) {
        super(nrotarjeta, fechaapertura, saldo, fechavenc);
        this.Lsobregiro = Lsobregiro;
    }


    public SucursalBancaria getSucursal() {
        return getSucursal();
    }
}
