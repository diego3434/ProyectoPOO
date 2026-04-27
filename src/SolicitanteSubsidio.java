public class SolicitanteSubsidio {

    private String nombreCompleto;
    private String cedula;
    private double ingresoMensual;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresoMensual,
                               int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.ingresoMensual = ingresoMensual;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setIngresoMensual(double ingresoMensual) {
        if (ingresoMensual >= 470) {
            this.ingresoMensual = ingresoMensual;
        } else {
            System.out.println("El ingreso mensual debe ser mayor o igual a $470");
        }
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos > 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Ingrese una cantidad positiva");
        }
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    public boolean subsidioAprobado() {
        return ingresoMensual <= 1200 &&
                cantidadVehiculos <= 1 &&
                viveEnEcuador;
    }

    public void generarResultado() {
        if (subsidioAprobado()) {
            System.out.println("===== Resultado de la evaluación =====");
            System.out.println("Subsidio aprobado: Cumple con todos los requisitos establecidos.");
        } else {
            System.out.println("===== Resultado de la evaluación =====");
            System.out.println("Subsidio rechazado por las siguientes razones:");

            if (ingresoMensual > 1200) {
                System.out.println("- Ingreso mensual mayor a $1200");
            }
            if (cantidadVehiculos > 1) {
                System.out.println("- Cantidad de vehículos mayor a 1");
            }
            if (!viveEnEcuador) {
                System.out.println("- No reside en Ecuador");
            }
        }
    }

    @Override
    public String toString(){
        return "====== Datos del solicitante ======\n"+
                "Nombre: " + nombreCompleto + "\n" +
                "Cedula: " + cedula + "\n" +
                "Ingresos mensuales: " + ingresoMensual + "\n" +
                "Cantidad de vehiculos: " + cantidadVehiculos + "\n" +
                "Vive en Ecuador:  " + viveEnEcuador;
    }
    public  static void mostrarReglasSubsidio(){
        System.out.println(" ====== Reglas para obtener el subsidio ======");
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2. No poseer mas de un vehiculo registrado.");
        System.out.println("3. Tener residencia en Ecuador.");
        System.out.println("======================================================");
    }
    public double calcularConsumoMensual(){
        double km= 400;
        return km/40;
    }
    public double calcularConsumoMensual(double kmExtra){
        double km=400 + kmExtra;
        return km/40;
    }

}

