public class CuentaBancaria {
    private String nrotarjeta;
    private String fechaapertura;
    private int saldo;

    public CuentaBancaria() {
    }

    public String getNrotarjeta() {
        return nrotarjeta;
    }

    public void setNrotarjeta(String nrotarjeta) {
        this.nrotarjeta = nrotarjeta;
    }

    public String getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(String fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getFechavenc() {
        return fechavenc;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "nrotarjeta='" + nrotarjeta + '\'' +
                ", fechaapertura='" + fechaapertura + '\'' +
                ", saldo=" + saldo +
                ", fechavenc='" + fechavenc + '\'' +
                '}';
    }

    public void setFechavenc(String fechavenc) {
        this.fechavenc = fechavenc;
    }

    public CuentaBancaria(String nrotarjeta, String fechaapertura, int saldo, String fechavenc) {
        this.nrotarjeta = nrotarjeta;
        this.fechaapertura = fechaapertura;
        this.saldo = saldo;
        this.fechavenc = fechavenc;
    }

    private String fechavenc;


}
