package Services;


import Entities.Cliente;
import Entities.Cuota;
import Entities.Poliza;
import Entities.Vehiculo;
import Enumeradores.FormaPago;
import Enumeradores.Tipo;
import Enumeradores.TipoCobertura;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import java.util.Scanner;



/**
 *
 * @author dudum
 */
public class SeguroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int polizaNro = 10000;

    public Cliente ingresarClientes(int dni) {

        System.out.print("Ingrese el Nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = leer.next();
        System.out.print("Domicilio: ");
        String domicilio = leer.next();
        System.out.print("mail: ");
        String mail = validarString();
        System.out.print("Telefono: ");
        String telefono = validarString();

        return new Cliente(nombre, apellido, domicilio, dni, mail, telefono);
    }

    private Vehiculo ingresarVehiculo(Cliente get, String patente) {

        Tipo tip;
        System.out.print("Marca del Vehiculo: ");
        String marca = validarString();

        System.out.print("Modelo: ");
        String modelo = validarString();

        System.out.print("Año: ");
        int ano = validarEntero();

        System.out.print("Motor Nro.: ");
        String motor = validarString();

        System.out.print("Chasis Nro.: ");
        String chasis = validarString();

        System.out.print("Color: ");
        String color = validarString();

        System.out.println("Tipo: ");
        for (int i = 0; i < Tipo.values().length; i++) {
            System.out.print((i + 1) + ".-" + Tipo.values()[i] +" ");
        }

        System.out.println("");
        int opc = validarEntero();
        tip = Tipo.values()[(opc - 1)];
        return new Vehiculo(marca, modelo, ano, patente, motor, chasis, color, tip, get);
    }

    public Poliza generarPoliza(ArrayList<Cliente> clientesArray, ArrayList<Vehiculo> autoArray) throws ParseException {

        
         this.polizaNro = polizaNro + 1;

        System.out.println("Usted esta por generar la Poliza Nro. " + polizaNro);
        System.out.println("");
        System.out.print("Ingrese el DNI del Cliente: ");
        int dni = validarEntero();
        if (!clienteExiste(clientesArray, dni)) {
            clientesArray.add(ingresarClientes(dni));
        }
        int indexCl = indexCliente(clientesArray, dni);

        Cliente cliente = clientesArray.get(indexCl);

        System.out.print("Ingrese la Patente del auto: ");
        String patente = validarString().toUpperCase();
        if (!autoeExiste(autoArray, patente)) {
            autoArray.add(ingresarVehiculo(clientesArray.get(indexCl), patente));
        }
        int indexAuto = indexAuto(autoArray, patente);

        Vehiculo auto = autoArray.get(indexAuto);

        System.out.print("Indique el Monto Asegurado: ");
        double montoAsegurado = validarDouble();

        System.out.println("Indique el Tipo de Cobertura");
        for (int i = 0; i < TipoCobertura.values().length; i++) {
            System.out.print((i + 1) + ".- " + TipoCobertura.values()[i] + "// ");
        }
        System.out.println("");
        int opcCobertura = validarEntero() - 1;
        TipoCobertura tc = TipoCobertura.values()[opcCobertura];
        int cobertura = tc.getValue();

        System.out.print("Incluye Cobertura x Granizo (S/N)");
        boolean granizo = validarString().equalsIgnoreCase("S");

        System.out.print("Ingrese Fecha inicio de Poliza(DD/MM/AAAA): ");
        String fInicio = validarString();
        Date fechaInicio = convertirFecha(fInicio);
        
        System.out.print("Defina la vigencia de la Poliza(en meses): ");
        int vigencia = validarEntero();

        Date fechaFin = calcularFecha(fechaInicio, vigencia);

        double prima = calcularPrima(montoAsegurado, cobertura, granizo, vigencia);
        System.out.println("El monto de la PRIMA es de: " + String.format("%.2f", prima));

        System.out.print("Defina cant cuotas: ");
        int cuotas = validarEntero();

        System.out.println("Como va a Pagarlo?");
        for (int i = 0; i < FormaPago.values().length; i++) {
            System.out.print((i + 1) + ".- " + FormaPago.values()[i] + "// ");
        }
        System.out.println("");
        int pagoCon = validarEntero() - 1;

        FormaPago fp = FormaPago.values()[pagoCon];
        ArrayList<Cuota> cuotaArray = new ArrayList();
        
        for (int i = 0; i < cuotas; i++) {
            cuotaArray.add(generarCuota(prima, cuotas, polizaNro, fp, (i + 1), fechaInicio));
        }

        System.out.println(cuotaArray);
        boolean vigente = true;

       

        return new Poliza(auto, cliente, polizaNro, tc, montoAsegurado, prima, granizo, vigente, fechaInicio, fechaFin, cuotaArray, fp);
    }

    private boolean clienteExiste(ArrayList<Cliente> clientesArray, int dni) {

        boolean ref = false;

        for (Cliente aux : clientesArray) {
            if (aux.getDni() == dni) {
                ref = true;
                break;
            }
        }
        return ref;
    }

    private int indexCliente(ArrayList<Cliente> clientesArray, int dni) {

        int index = -1;

        do {
            index++;
        } while (clientesArray.get(index).getDni() != dni);

        return index;
    }

    private boolean autoeExiste(ArrayList<Vehiculo> autoArray, String patente) {

        boolean ref = false;

        for (Vehiculo aux : autoArray) {
            if (aux.getPatente().equalsIgnoreCase(patente)) {
                ref = true;
                break;
            }
        }
        return ref;
    }

    private int indexAuto(ArrayList<Vehiculo> autoArray, String patente) {

        int index = -1;

        do {
            index++;
        } while (!autoArray.get(index).getPatente().equalsIgnoreCase(patente));

        return index;
    }

    private Date calcularFecha(Date fecha, int i) {

        int a = (i / 12);
        i = i - (a * 12);
        Date vencimiento = new Date();
        vencimiento.setDate(10);
        vencimiento.setYear(fecha.getYear() + a);

        if (fecha.getMonth() + i < 13) {
            vencimiento.setMonth(fecha.getMonth() + i);
        } else {
            vencimiento.setMonth(fecha.getMonth() + i - 12);
            vencimiento.setYear(vencimiento.getYear() + 1);
        }
        return vencimiento;
    }

    private double calcularPrima(double montoAsegurado, int cobertura, boolean granizo, int vigencia) {

        double gran = 1;
        if (granizo) {
            gran = 1.12;
        }
        return (montoAsegurado * ((double) cobertura / 100) * gran / 12 * vigencia);

    }

    private Cuota generarCuota(double prima, int cuotas, int polizaNro, FormaPago fp, int i, Date fecha) {

        double montoCuota = prima / cuotas;
        boolean pagado = false;

        Date vencimiento = calcularFecha(fecha, i);

        return new Cuota(i, montoCuota, pagado, vencimiento, polizaNro, fp);
    }

    private Date convertirFecha(String fInicio) {

        // separo el dia
        int dia;
        int mes;
        int ano;
        String auxDia = "";
        String auxMes = "";
        String auxAno = "";
        int contBarra = 1;

        for (int i = 0; i < fInicio.length(); i++) {
            switch (contBarra) {
                case 1:
                    if (!fInicio.substring(i, i + 1).equals("/") && !fInicio.substring(i, i + 1).equals("-")) {
                        auxDia = auxDia.concat(fInicio.substring(i, i + 1));
                    } else {
                        contBarra++;
                    }
                    break;
                case 2:
                    if (!fInicio.substring(i, i + 1).equals("/") && !fInicio.substring(i, i + 1).equals("-")) {
                        auxMes = auxMes.concat(fInicio.substring(i, i + 1));
                    } else {
                        contBarra++;
                    }
                    break;
                case 3:
                    if (!fInicio.substring(i, i + 1).equals("/") && !fInicio.substring(i, i + 1).equals("-")) {
                        auxAno = auxAno.concat(fInicio.substring(i, i + 1));
                    }
            }
        }

        dia = Integer.parseInt(auxDia);
        mes = Integer.parseInt(auxMes) - 1;
        ano = Integer.parseInt(auxAno) - 1900;

        Date fecha = new Date();

        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(ano);

        return fecha;
    }

    public void pagoCuota(ArrayList<Poliza> poliArray, ArrayList<Cliente> clientesArray) {

        System.out.print("Ingrese la Fecha de hoy (DD/MM/AAAA): ");
        String fHoy = validarString();

        Date fechaHoy = convertirFecha(fHoy);

        System.out.print("Ingrese DNI del Cliente: ");
        int dni = validarEntero();

        ArrayList<Poliza> polizaCliente = new ArrayList();

        if (clienteExiste(clientesArray, dni)) {
            int indexC = indexCliente(clientesArray, dni);
        }
        for (Poliza aux : poliArray) {
            if (aux.getCliente().getDni() == dni) {
                polizaCliente.add(aux);
            }
        }
        String estado = "";
        System.out.printf("%-1s %-10s %-15s %-18s %-20s %-30s\n", "Vehiculo", "Poliza", "Cuota", "Importe", "Fecha Vto", "Estado");
        for (int i = 0; i < polizaCliente.size(); i++) {
            for (int j = 0; j < polizaCliente.get(i).getCuotas().size(); j++) {
                if (fechaHoy.after(polizaCliente.get(i).getCuotas().get(j).getVencimiento())) {
                    if (!polizaCliente.get(i).getCuotas().get(j).isPagado()) {
                        if (polizaCliente.get(i).getCuotas().get(j).isPagado()) {
                            estado = "PAGADO";
                        } else {
                            estado = "IMPAGO";
                        }
                        System.out.printf("%-4s %-10d %-23d %-20.2f %-20s %-30s\n", polizaCliente.get(i).getAuto().getPatente(), polizaCliente.get(i).getNroPoliza(), polizaCliente.get(i).getCuotas().get(j).getNroCuota(), polizaCliente.get(i).getCuotas().get(j).getMontoCuota(), (polizaCliente.get(i).getCuotas().get(j).getVencimiento().getDate() + "/" + (polizaCliente.get(i).getCuotas().get(j).getVencimiento().getMonth()+1) + "/" + (polizaCliente.get(i).getCuotas().get(j).getVencimiento().getYear()+1900)), estado);
                    }
                }
            }
        }
    }
    
    private int validarEntero() {
        while (true) {
            try {
                return Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número entero válido.\n");
            }
        }
    }
    
    private double validarDouble() {
        while (true) {
            try {
                return Double.parseDouble(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido.\n");
            }
        }
    }
    private String validarString() {
    String entrada = leer.next();
    while (entrada.isEmpty()) {
        System.out.print("Ingrese un valor válido.\n");
        entrada = leer.next();
    }
    return entrada;
}
    
}
