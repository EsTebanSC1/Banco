public class SucursalBancaria {
    private String CodSucursal;
    private String CodPostal;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodSucursal() {
        return CodSucursal;
    }

    @Override
    public String toString() {
        return "SucursalBancaria{" +
                "CodSucursal='" + CodSucursal + '\'' +
                ", CodPostal='" + CodPostal + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }



    public void setCodSucursal(String codSucursal) {
        CodSucursal = codSucursal;
    }

    public String getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(String codPostal) {
        CodPostal = codPostal;
    }

    public SucursalBancaria(String codSucursal, String codPostal) {
        CodSucursal = codSucursal;
        CodPostal = codPostal;
        this.nombre = nombre;
    }
}
