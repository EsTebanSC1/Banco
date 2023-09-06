import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionBanco {
    private List<Cliente> clientes;
    private List<CuentaBancaria> cuentasBancarias;
    private List<SucursalBancaria> sucursales;

    public GestionBanco() {
        clientes = new ArrayList<>();
        cuentasBancarias = new ArrayList<>();
        sucursales = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarCuentaBancaria(CuentaBancaria cuentaBancaria) {
        cuentasBancarias.add(cuentaBancaria);
    }

    public void agregarSucursal(SucursalBancaria sucursal) {
        sucursales.add(sucursal);
    }

    public void visualizarCuentasDeCliente(Cliente cliente) {
        System.out.println("Cuentas de " + cliente.getNombre() + ":");
        List<CuentaBancaria> cuentas = cliente.getCuentasBancarias();
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }

    public List<CuentaAhorro> obtenerCuentasDeAhorroEnSucursal(SucursalBancaria sucursal) {
        List<CuentaAhorro> cuentasAhorroEnSucursal = new ArrayList<>();
        for (CuentaBancaria cuenta : cuentasBancarias) {
            if (cuenta instanceof CuentaAhorro && ((CuentaAhorro) cuenta).getSucursal() == sucursal) {
                cuentasAhorroEnSucursal.add((CuentaAhorro) cuenta);
            }
        }
        return cuentasAhorroEnSucursal;
    }

    public List<CuentaCorriente> obtenerCuentasCorrienteEnSucursal(SucursalBancaria sucursal) {
        List<CuentaCorriente> cuentasCorrienteEnSucursal = new ArrayList<>();
        for (CuentaBancaria cuenta : cuentasBancarias) {
            if (cuenta instanceof CuentaCorriente && ((CuentaCorriente) cuenta).getSucursal() == sucursal) {
                cuentasCorrienteEnSucursal.add((CuentaCorriente) cuenta);
            }
        }
        return cuentasCorrienteEnSucursal;
    }

    public static void main(String[] args) {
        GestionBanco banco = new GestionBanco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Agregar Cuenta Bancaria");
            System.out.println("3. Agregar Sucursal Bancaria");
            System.out.println("4. Visualizar Cuentas de un Cliente");
            System.out.println("5. Obtener Cuentas de Ahorro en una Sucursal");
            System.out.println("6. Obtener Cuentas Corriente en una Sucursal");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la línea en blanco

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el Rut del cliente: ");
                    String rutCliente = scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingrese el correo del cliente: ");
                    String correoCliente = scanner.nextLine();
                    System.out.print("Ingrese la dirección del cliente: ");
                    String direccionCliente = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    String telefonoCliente = scanner.nextLine();

                    Cliente cliente = new Cliente(rutCliente);
                    cliente.setNombre(nombreCliente);
                    cliente.setCorreo(correoCliente);
                    cliente.setDireccion(direccionCliente);
                    cliente.setTelefono(telefonoCliente);
                    banco.agregarCliente(cliente);
                    break;

                case 2:
                    System.out.print("Ingrese el número de cuenta: ");
                    String numeroCuenta = scanner.nextLine();
                    System.out.print("Ingrese el saldo de la cuenta: ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine();  // Consumir la línea en blanco
                    System.out.print("Ingrese el tipo de cuenta (Ahorro/Corriente): ");
                    String tipoCuenta = scanner.nextLine();

                    CuentaBancaria cuenta;
                    if (tipoCuenta.equalsIgnoreCase("Ahorro")) {
                        System.out.print("Ingrese el porcentaje de reajuste anual: ");
                        double porcentajeReajuste = scanner.nextDouble();
                        scanner.nextLine();  // Consumir la línea en blanco
                        cuenta = new CuentaAhorro(numeroCuenta, saldo, porcentajeReajuste);
                    } else if (tipoCuenta.equalsIgnoreCase("Corriente")) {
                        System.out.print("Ingrese la línea de sobregiro: ");
                        double lineaSobregiro = scanner.nextDouble();
                        scanner.nextLine();  // Consumir la línea en blanco
                        cuenta = new CuentaCorriente(numeroCuenta, saldo, lineaSobregiro);
                    } else {
                        System.out.println("Tipo de cuenta no válido.");
                        continue;
                    }

                    System.out.print("Ingrese el Rut del cliente asociado: ");
                    String rutClienteAsociado = scanner.nextLine();
                    Cliente clienteAsociado = null;
                    for (Cliente c : banco.clientes) {
                        if (c.getRut().equalsIgnoreCase(rutClienteAsociado)) {
                            clienteAsociado = c;
                            break;
                        }
                    }

                    if (clienteAsociado == null) {
                        System.out.println("Cliente no encontrado.");
                        continue;
                    }

                    banco.agregarCuentaBancaria(cuenta);
                    break;

                case 3:
                    System.out.print("Ingrese el código de sucursal: ");
                    String codigoSucursal = scanner.nextLine();
                    System.out.print("Ingrese el código postal de la sucursal: ");
                    String codigoPostal = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la sucursal: ");
                    String nombreSucursal = scanner.nextLine();



                    SucursalBancaria sucursal = new SucursalBancaria(codigoSucursal, codigoPostal);
                    sucursal.setNombre(nombreSucursal);
                    sucursal.setNombre(nombreSucursal);
                    banco.agregarSucursal(sucursal);
                    break;

                case 4:
                    System.out.print("Ingrese el Rut del cliente para visualizar sus cuentas: ");
                    String rutClienteVisualizar = scanner.nextLine();
                    Cliente clienteVisualizar = null;
                    for (Cliente c : banco.clientes) {
                        if (c.getRut().equalsIgnoreCase(rutClienteVisualizar)) {
                            clienteVisualizar = c;
                            break;
                        }
                    }

                    if (clienteVisualizar == null) {
                        System.out.println("Cliente no encontrado.");
                    } else {
                        banco.visualizarCuentasDeCliente(clienteVisualizar);
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el nombre de la sucursal para obtener cuentas de ahorro: ");
                    String nombreSucursalAhorro = scanner.nextLine();
                    SucursalBancaria sucursalAhorro = null;
                    for (SucursalBancaria s : banco.sucursales) {
                        if (s.getNombre().equalsIgnoreCase(nombreSucursalAhorro)) {
                            sucursalAhorro = s;
                            break;
                        }
                    }

                    if (sucursalAhorro == null) {
                        System.out.println("Sucursal no encontrada.");
                    } else {
                        List<CuentaAhorro> cuentasAhorro = banco.obtenerCuentasDeAhorroEnSucursal(sucursalAhorro);
                        for (CuentaAhorro ca : cuentasAhorro) {
                            System.out.println(ca);
                        }
                    }
                    break;

                case 6:
                    System.out.print("Ingrese el nombre de la sucursal para obtener cuentas corriente: ");
                    String nombreSucursalCorriente = scanner.nextLine();
                    SucursalBancaria sucursalCorriente = null;
                    for (SucursalBancaria s : banco.sucursales) {
                        if (s.getNombre().equalsIgnoreCase(nombreSucursalCorriente)) {
                            sucursalCorriente = s;
                            break;
                        }
                    }

                    if (sucursalCorriente == null) {
                        System.out.println("Sucursal no encontrada.");
                    } else {
                        List<CuentaCorriente> cuentasCorriente = banco.obtenerCuentasCorrienteEnSucursal(sucursalCorriente);
                        for (CuentaCorriente cc : cuentasCorriente) {
                            System.out.println(cc);
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}