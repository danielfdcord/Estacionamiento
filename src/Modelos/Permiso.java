
package Modelos;

public class Permiso {

    private NivelUsuario nivel;
    private String nombre;

    public Permiso(NivelUsuario nivel, String nombre) {
        this.nivel = nivel;
        this.nombre = nombre;
    }

    public NivelUsuario getNivel() {
        return nivel;
    }

    public void setNivel(NivelUsuario nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
