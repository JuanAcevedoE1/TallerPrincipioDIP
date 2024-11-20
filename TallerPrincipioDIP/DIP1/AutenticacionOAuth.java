package TallerPrincipioDIP.DIP1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación OAuth
        return "oauthUsuario".equals(usuario) && "oauthContrasena".equals(contrasena);
    }
}