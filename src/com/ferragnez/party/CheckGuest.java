//verificare che il nome sia presente nella lista (:esclamazione:ATTENZIONE: in Java
// per confrontare due stringhe non posso usare ==, ma devo usare il metodo equals(): esempio qui)
//lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole:
//:simbolo_addizione_in_grassetto:Bonus: se avete usato il ciclo for per cercare il nome nella
// lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa
//Buon lavoro e buon weekend! :faccia_leggermente_sorridente:
//:tada: Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax,
// Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis",
                "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Come ti chiami?");

        String nome = scan.nextLine();
      boolean seiSullaLista = false;


      for (int i = 0; i < invitati.length; i++) {
          if (nome.equals(invitati[i])) {
              seiSullaLista = true;
              break;
          }
      }

            if(seiSullaLista){
                System.out.println("Puoi entrare");
            }
            else{
                System.out.println("Mi dispiace, non sei sulla lista");
            }
            scan.close();
        }

    }

