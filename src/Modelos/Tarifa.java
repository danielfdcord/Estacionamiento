
package Modelos;

import java.util.Date;

public class Tarifa {
    
    private final int cantidadIngresosSinSaldo;
    private final boolean esDeAbono;
    private final Date fecha;
    private final int montoIngreso;

    public Tarifa(int cantidadIngresosSinSaldo, boolean esDeAbono, Date fecha, int montoIngreso) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.esDeAbono = esDeAbono;
        this.fecha = fecha;
        this.montoIngreso = montoIngreso;
    }
    
    
    public TipoVehiculo conocerTipoVehiculo(TipoVehiculo vehiculo){
        return vehiculo;
    }

    
}
