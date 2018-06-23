
package Modelos;

import java.util.List;

public class Usuario {
    
private final String apellido;
private final String nombre;
private final String nombreUsuario;
private final String password;

    List<Permiso> permisos;

    public Usuario(String apellido, String nombre, String nombreUsuario, String password, List<Permiso> permisos) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permisos = permisos;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }
    
    public List<Permiso> conocerPermisos(){
       return this.permisos;
    }

}
