package TallerPrincipioDIP.DIP1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación local
        return "usuario".equals(usuario) && "contrasena".equals(contrasena);
    }
}

