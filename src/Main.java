import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        SolicitanteSubsidio.mostrarReglasSubsidio();
        System.out.println();

        System.out.print("Ingrese su nombre completo: ");
        String nombre= sc.nextLine();

        System.out.print("Ingrese su cedula: ");
        String cedula= sc.nextLine();

        System.out.print("Ingrese sus ingresos mensuales: ");
        Double ingreso=sc.nextDouble();

        System.out.print("Ingrese la cantidad de vehiculos: ");
        int cantidad= sc.nextInt();

        System.out.print("¿Vive en Ecuador: ?");
        boolean vive= sc.nextBoolean();
        System.out.println();
        SolicitanteSubsidio s= new SolicitanteSubsidio(nombre, cedula, ingreso, cantidad, vive);

        System.out.println(s);
        System.out.println();

        s.generarResultado();
        System.out.println();

        System.out.println("===== Calculo del consumo mensual =====");
        double consumo1= s.calcularConsumoMensual();
        double consumo2= s.calcularConsumoMensual(80);

        System.out.println("Consumo mensual estimado (sin km extra): " + consumo1 + " galones");
        System.out.println("Consumo mensual estimado (80 km adicionales): " + consumo2 + " galones");
    }
}
