package implementaciones;

import clases.Socio;
import interfaces.ILogin;

public class LoginAdapter implements ILogin {	

    @Override
    public void login(String usuario, String contraseña, Socio socio) {
        
        if (usuario.equals(socio.getUsuario()) && contraseña.equals(socio.getContraseña())) {
            System.out.println("Inicio de sesión exitoso para el usuario: " + usuario);
        } else {
            System.out.println("Error de inicio de sesión: credenciales inválidas.");
        }
    }
    
}

