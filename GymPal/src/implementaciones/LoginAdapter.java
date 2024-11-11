public class LoginAdapter {

    public void login(String user, String pass) {
        // Aca iria logica de login
        System.out.println("Intentando iniciar sesión con el usuario: " + user);
        if (authenticate(user, pass)) {
            System.out.println("Inicio de sesión exitoso para el usuario: " + user);
        } else {
            System.out.println("Error de inicio de sesión: credenciales inválidas.");
        }
    }
}
