
package Modelos;

import java.util.Date;

public class Ingreso {
    
private final int codigoBarra;
private final Date fechaEgreso;
private final Date fechaIngreso;
private final Date horaEgreso;
private final Date horaIngreso;
private final int monto;
private final int nroTicket;
private final String observacion;

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
   
    public String conocerPortonUtilizado(Porton portonUtilizado){
        return portonUtilizado.getNombre();
    }
    
    
    public float conocerTarifa(TipoVehiculo vehiculoIngresado){ //no se si esta bien ...
        if(vehiculoIngresado==vehiculoIngresado.AUTO){
        return 50.0f;
        } 
        if (vehiculoIngresado==vehiculoIngresado.MOTO){
        return 20.0f;
        }
        else{
            return 0f;
        }
    }
    
  
    public TipoVehiculo conocerVehiculo(TipoVehiculo vehiculoIngresado){ // no se si esta bien.
        return vehiculoIngresado;
    }
    
    public String conocerUsuario(Usuario usuarioActual){
        
        return "Usuario Ingresado: "+usuarioActual.getNombre()+" "+usuarioActual.getApellido();
    }  
    
   
    public int determinarNroIngreso(){                              //FALTA...
        return 0;
    }


}
