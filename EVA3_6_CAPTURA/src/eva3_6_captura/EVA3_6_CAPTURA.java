/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_6_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String nombres[];
        int cant;
        System.out.println("Cantidad de clientes a capturar");
        cant = captu.nextInt();
        captu.nextLine();
        nombres = new String[cant];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nomrbe del cliente: ");
            nombres[i] = captu.nextLine();
        }
        System.out.println("Datos capturados");
        for (int i = 0; i < 10; i++) {
            System.out.println(nombres[i]);
            
        }
        
    }
    
}
