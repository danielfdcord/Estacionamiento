
package Modelos.Login;
import Modelos.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Login {
    
    //Creacion del Usuario N°1
    public static Permiso permisoU1C = new Permiso (NivelUsuario.CAJERO, "CAJERO");
    public static Permiso permisoU1A = new Permiso (NivelUsuario.ADMINISTRADOR, "ADMINISTRADOR");
    public static List<Permiso> permisosU1 = Arrays.asList(permisoU1C,permisoU1A);   
    public static Usuario usuario1 = new Usuario("Fernandez", "Daniel", "danielfdcord", "123", permisosU1);
    
    //Creacion del metodo LOG
    public static void Logear(){
        
        Scanner scan = new Scanner (System.in);
        System.out.println("-----------------------LOGIN-----------------------");
    
        String nombre;
        String pass;
        int index=0;    
        do{
            index++;
            if(index>1 && index<4){
                System.out.println("Intento N° "+index+" ≤ 3");
            }
            if (index==4){
                break;
            }

            System.out.println("\nIngresar");
            System.out.print("\nNombre de Usuario: ");
            nombre = scan.next();
            
            System.out.print("\nPassword: ");
            pass = scan.next(); 
            
        
            if (!nombre.equals(usuario1.getNombreUsuario())){
                System.out.println("\nNombre de usuario: INCORRECTO");
                System.out.println("ingresaste :"+nombre);
            }
            if (!pass.equals(usuario1.getPassword())){
                System.out.println("\nContraseña: INCORRECTO");
                System.out.println("Ingresaste:"+pass);
            }
            System.out.println("------------------------------------------------");
                     
        }
        while(!nombre.equals(usuario1.getNombreUsuario()) || !pass.equals(usuario1.getPassword()));
        if (index<4){
        System.out.println("\n| ACCESO EXITOSO |");    
        }
        else{
            System.out.println("\n | Seguridad: CIERRE DEL SISTEMA |");
            System.out.println("   Detalles: ");
            System.out.println("   Errar mas de 3 veces el intento de Login");
        }     
    }   // Fin del metodo Logear().  
    
    public static void main(String[] args) {
        Logear();
       
    }
}


