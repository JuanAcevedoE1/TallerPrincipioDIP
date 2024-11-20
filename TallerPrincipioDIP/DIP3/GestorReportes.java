package TallerPrincipioDIP.DIP3;

public class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void crearReporte(String contenido) {
        generadorReporte.generarReporte(contenido);
    }
}