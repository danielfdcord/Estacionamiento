
package Modelos;

import java.util.Date;

public class AbonoPropietario {
    
    
    private Date fecha;
    private Date hora;
    
    private float montoCobrado=0f;
    private int nroComprobante;
    private float saldoActual=0f;
 
    public AbonoPropietario(Date fecha, Date hora, int montoCobrado, int nroComprobante, int saldoActual) {
        this.fecha = fecha;
        this.hora = hora;
        this.montoCobrado = montoCobrado;
        this.nroComprobante = nroComprobante;
        this.saldoActual = saldoActual;
    }
    
    public int conocerIngreso(Ingreso ingresosPropietario){
        
        return ingresosPropietario.determinarNroIngreso();
        
    }
    public void mostrarFechaYHora(){
       
        System.out.println("La fecha es: "+this.getFecha()+" Y la hora: "+this.getHora());
    }
      
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    public void setMontoCobrado(float montoCobrado) {
        this.montoCobrado = montoCobrado;
    }
   
    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public void setSaldoActual(float montocobrado) {
        saldoActual = saldoActual + montoCobrado;
        this.saldoActual = saldoActual;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }

    public int getNroComprobante() {
        return nroComprobante;
    }

    public float getMontoCobrado() {
       return montoCobrado;
    }
    
    public float getSaldoActual() {
        return saldoActual;
    }
    
    
    
    
}
