
package Modelos;

import java.util.Date;

public class Ingreso {
    
int codigoBarra;
Date fechaEgreso;
Date fechaIngreso;
Date horaEgreso;
Date horaIngreso;
int monto;
int nroTicket;
String observacion;

    public Ingreso(int codigoBarra, Date fechaEgreso, Date fechaIngreso, Date horaEgreso, Date horaIngreso, int monto, int nroTicket, String observacion) {
        this.codigoBarra = codigoBarra;
        this.fechaEgreso = fechaEgreso;
        this.fechaIngreso = fechaIngreso;
        this.horaEgreso = horaEgreso;
        this.horaIngreso = horaIngreso;
        this.monto = monto;
        this.nroTicket = nroTicket;
        this.observacion = observacion;
    }
   
    public void conocerPorton(){
    
    }
    public void conocerTarifa(){
        
    }
    public void conocerUsuario(){
        
    }
    public void conocerVehiculo(){
        
    }
    public int determinarNroIngreso(){
        return 0;
    }


}
