
package Modelos;

import java.util.Date;

public class Tarifa {
    
    int cantidadIngresosSinSaldo;
    boolean esDeAbono;
    Date fecha;
    int montoIngreso;

    public Tarifa(int cantidadIngresosSinSaldo, boolean esDeAbono, Date fecha, int montoIngreso) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.esDeAbono = esDeAbono;
        this.fecha = fecha;
        this.montoIngreso = montoIngreso;
    }
    
    
    public void conocerTipoVehiculo(){
        
    }

    
}
