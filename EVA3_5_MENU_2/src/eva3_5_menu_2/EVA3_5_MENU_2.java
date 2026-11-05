/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_menu_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_5_MENU_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] opciones = {"Ventas", "Clientes", "Proveedores", "Salir"};
        System.out.println("--------MENU DEL SISTEMA---------");
        for(int i = 0; i < opciones.length; i++) {
            System.out.println(i+ " - " + opciones[i]);
        }
        Scanner captu = new Scanner(System.in);
        System.out.println("Selecciona una opcion");
        int sel = captu.nextInt();
        switch(sel){
            case 0: System.out.println("Modulo de ventas");
            break;
            case 1: System.out.println("Modulo de clientes");
            break;
            case 2: System.out.println("Modulo de proveedores");
            break;
            case 3: System.out.println("Saliendo del sistema");
            break;
            default:
                System.out.println("Opcion invalida");
        }
    }
    
}
