package TallerPrincipioDIP.DIP1;
// Main.java
public class Main {
    public static void main(String[] args) {
        // Usando autenticación local
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);
        System.out.println("Autenticación Local: " + gestorLocal.autenticarUsuario("usuario", "contrasena"));

        // Usando autenticación OAuth
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);
        System.out.println("Autenticación OAuth: " + gestorOAuth.autenticarUsuario("oauthUsuario", "oauthContrasena"));
    }
}