import java.util.List;

public class Cliente {
  private String rut;
  private String nombre;
  private String correo;
  private String direccion;
  private String telefono;

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Cliente(String rut) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public List<CuentaBancaria> getCuentasBancarias() {
        return getCuentasBancarias();
    }
}
