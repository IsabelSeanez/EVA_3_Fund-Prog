/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_arreglos_multi_2;

/**
 *
 * @author bisonte
 */
public class EVA3_11_ARREGLOS_MULTI_2 {

   /**
    * @param args the command
    * line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int cubo [][][] = new int [2][3][4]; //24 enteros
      for (int i = 0; i < cubo.length; i++) { //1era dimension
         for (int j = 0; j < cubo[i].length; j++) { //2da dimension
            for (int k = 0; k < cubo[i][j].length; k++) {//3era dimension
               cubo[i][j][k] = (int)(Math.random() * 100);
            }
            
         }
         
      }
      //COMO MOSTRAMOS LOS VALORES?
      for (int i = 0; i < cubo.length; i++) {
         for (int j = 0; j < cubo[i].length; j++) {
            for (int k = 0; k < cubo[i][j].length; k++) {
               System.out.println("[" + cubo[i][j][k] + "]");
            }
            System.out.println("");
         }
      }
   }
   
}
