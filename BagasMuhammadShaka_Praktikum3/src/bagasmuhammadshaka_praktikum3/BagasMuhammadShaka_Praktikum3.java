/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package bagasmuhammadshaka_praktikum3;

import java.util.Scanner;



/**

 *

 * @author Praktikan

 */

public class BagasMuhammadShaka_Praktikum3 {



    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       

       while (true){

       System.out.print("Masukkan Nilai : ");

       int nilai = input.nextInt();

       String hurufMutu;



       

       if (nilai >= 100){

          System.out.println("Maaf Inputan Anda Salah");

          break;

       }

       if((nilai%10) == 0){

          System.out.println("Ini kelipatan 10");

          continue;

       }

       if (nilai >= 76){

           hurufMutu = "A";

       }

       else if (nilai >= 71){

           hurufMutu = "B+";

       }

       else if (nilai >= 66){

           hurufMutu = "B";

       }

       else if(nilai >= 61){

           hurufMutu = "C+";

      }

        else if(nilai>=56){

           hurufMutu = "C";

     }

        else if(nilai>=50){

            hurufMutu ="D";

    }

       else{

           hurufMutu ="E";

       }

       

       switch(hurufMutu){

           case "A":

               System.out.println("Lulus");

               break;

           case "B+":

               System.out.println("Lulus");

               break;

           case "B":

               System.out.println("Lulus");

               break;

           case "C+":

               System.out.println("Lulus");

               break;

          case "C":

               System.out.println("Lulus");

               break;

          case "D":

               System.out.println("Lulus Bersyarat");

               break;

          case "E":

               System.out.println("Kurang");

               break;


           default :

               System.out.println("Huruf Mutu Tidak ada");

       }

     }

  }

}

