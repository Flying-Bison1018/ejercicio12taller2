
package ejercicio12vectores;

import java.util.Scanner;


public class Ejercicio12vectores {

  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int registroVentas[][] = new int[2][2];   
        int[] automovilesPorVendedor = new int[2];
        int[] vehiculosPorModelo = new int[2];
        int totalVendedor = 0, totalModelo = 0;
        
        System.out.println("Registre Ventas");
        for(int i = 0; i < registroVentas.length; i++){
            for(int j = 0; j < registroVentas.length;j++ ){
                registroVentas[i][j] = entrada.nextInt();                
            }
        }
        
        for(int i = 0; i < registroVentas.length; i++){
            for(int j = 0; j < registroVentas.length;j++ ){
                totalVendedor = totalVendedor + registroVentas[i][j];
                totalModelo = totalModelo + registroVentas[j][i];
            }            
            automovilesPorVendedor[i] = totalVendedor;
            vehiculosPorModelo[i] = totalModelo;
            totalVendedor = 0;
            totalModelo = 0;
        }    
        System.out.println("Vendedor-Vehiculos");
        for(int i = 0; i < registroVentas.length; i++){
            for(int j = 0; j < registroVentas.length;j++ ){
                System.out.print(registroVentas[i][j] + " ");
            }
            System.out.println();
        }
        
        int mayor,vendedor = 0;
        mayor = automovilesPorVendedor[0];
        System.out.println();
        System.out.println("Total Automoviles Vendidos por Vendedor:");
        for(int i = 0; i < automovilesPorVendedor.length; i++){
            System.out.print(automovilesPorVendedor[i] + " ");            
            if(mayor < automovilesPorVendedor[i]){
                mayor = automovilesPorVendedor[i];
                vendedor = i;
            }            
        }
        System.out.println();
        System.out.println("Total Vehiculos Vendidos por Vehiculo:");
        for(int i = 0; i < vehiculosPorModelo.length; i++){
            System.out.print(vehiculosPorModelo[i] + " ");
        }
        
        System.out.println();
        System.out.println("Vendedor con Mas Ventas es "+ vendedor + " con " + mayor);
    }
    
}
