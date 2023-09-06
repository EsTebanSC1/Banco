public class CuentaAhorro extends CuentaBancaria{
private int tasareajuste;

    public CuentaAhorro(String numeroCuenta, double saldo, double porcentajeReajuste) {
        super();
    }

    public int getTasareajuste() {
        return tasareajuste;
    }

    public void setTasareajuste(int tasareajuste) {
        this.tasareajuste = tasareajuste;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tasareajuste=" + tasareajuste +
                '}';
    }

    public CuentaAhorro(String nrotarjeta, String fechaapertura, int saldo, String fechavenc) {
        super(nrotarjeta, fechaapertura, saldo, fechavenc);
this.tasareajuste = tasareajuste;
    }


    public SucursalBancaria getSucursal() {
        return getSucursal();
    }
}
