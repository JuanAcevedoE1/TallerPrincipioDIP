package TallerPrincipioDIP.DIP3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en Excel: " + contenido);
    }
}
