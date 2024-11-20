package TallerPrincipioDIP.DIP3;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        gestorPDF.crearReporte("Este es el contenido del reporte en PDF.");

        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        gestorExcel.crearReporte("Este es el contenido del reporte en Excel.");
    }
}