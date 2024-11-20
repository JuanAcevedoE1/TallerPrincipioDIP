package TallerPrincipioDIP.DIP2;

public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        gestorLocal.guardar("archivo1.txt", "Contenido del archivo local");
        System.out.println("Recuperado: " + gestorLocal.recuperar("archivo1.txt"));

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        gestorNube.guardar("archivo2.txt", "Contenido del archivo en la nube");
        System.out.println("Recuperado: " + gestorNube.recuperar("archivo2.txt"));
    }
}
