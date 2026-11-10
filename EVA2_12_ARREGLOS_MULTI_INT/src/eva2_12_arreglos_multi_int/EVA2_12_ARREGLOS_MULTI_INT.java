/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arreglos_multi_int;

/**
 *
 * @author bisonte
 */
public class EVA2_12_ARREGLOS_MULTI_INT {

   /**
    * @param args the command
    * line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String dias[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
      int califas[][] = {{50, 100, 75, 30}, {80, 66, 22, 10}};
      for (int i = 0; i < dias.length; i++) {
         System.out.println("[" + dias[i] + "]");
      }
      System.out.println("");
      for (int i = 0; i < califas.length; i++) {
         for (int j = 0; j < califas[i].length; j++) {
            System.out.println("[" + califas[i][j] + "]");
         }
         System.out.println("");
      }
   }
   
}
