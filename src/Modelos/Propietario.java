
package Modelos;

import java.util.ArrayList;


public class Propietario {
    
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<Vehiculo> vehiculosProp;

    public Propietario(String nombre, String apellido, int dni, ArrayList<Vehiculo> vehiculosProp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.vehiculosProp = vehiculosProp;
    }
    
    

    public ArrayList<Vehiculo> obtenerVehiculosPropietario(Propietario propietario){
        return vehiculosProp;
    }
    
    public int cuantosIngresosPeriodo(Ingreso ingresosUsuario){
        return ingresosUsuario.determinarNroIngreso();
    }
    
    public void acreditarMonto(AbonoPropietario abonoPropietario){
        abonoPropietario.setSaldoActual(abonoPropietario.getMontoCobrado());
    }
    
    public float calcularSaldoActual(AbonoPropietario abonoPropietario){
        return abonoPropietario.getSaldoActual();
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }
    
    

    
}
