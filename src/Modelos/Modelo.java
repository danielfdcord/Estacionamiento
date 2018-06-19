
package Modelos;

public enum Modelo {
    CORSA_CSV(Marca.CHEVROLET, 22),
    PALIO_FX(Marca.FIAT, 43),
    ROCKER_C(Marca.HARLEY, 666);
    
    private Marca marca;
    private int codigo;

    Modelo(Marca marca, int codigo){
        this.marca = marca;
        this.codigo = codigo;
    }
    
    public Marca conocerMarca(){
        return this.marca;
    }
    
}
