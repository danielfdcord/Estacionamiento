
package Modelos;

import java.util.List;

public class Usuario {
    
String apellido;
String nombre;
String nombreUsuario;
String password;

List<Permiso> permisos;

    public Usuario(String apellido, String nombre, String nombreUsuario, String password, List<Permiso> permisos) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permisos = permisos;
    }

    
    public List<Permiso> conocerPermisos(){
       return this.permisos;
    }

}
